import java.util.ArrayList;
import java.util.List;

//klasa modelująca pytanie, zawiera pola do zapisania tytułu, odpowiedzi i prawidłowej odpowiedzi
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
        sb.append(title + "\n");
        for (String a : answers) {
            sb.append(a).append("\n");
        }
        return sb.toString();
    }
}
