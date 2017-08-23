import java.util.ArrayList;
import java.util.List;


public class Question {

    private String title;
    private String correctAnswer;
    private List<String> answers = new ArrayList<>();

    public Question() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title);
        for (String a : answers) {
            sb.append(a).append("\n");
        }
        return sb.toString();
    }
}
