import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Quiz {

    private static final String PATH_TO_RESULT = "wyniki.txt";
    public static final String PATH_TO_QUESTIONS = "pytania.txt";

    public static List<String> getRanking() {
        List<String> result = null;
        try {
            return Files.readAllLines(Paths.get(PATH_TO_RESULT));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Question> readAllQuestions() {
        List<String> questionsFromFile = null;
        List<Question> questionList = new ArrayList<>();
        try {
            questionsFromFile = Files.readAllLines(Paths.get(PATH_TO_QUESTIONS));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < questionsFromFile.size(); i += 6) {
            Question question = new Question();
            question.setTitle(questionsFromFile.get(i));
            for (int j = 1; j <= 4; j++) {
                question.getAnswers().add(questionsFromFile.get(i + j));
            }
            question.setCorrectAnswer(questionsFromFile.get(i + 5));
            questionList.add(question);
        }

        return questionList;
    }

}
