import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printMenu();
    }

    public static void printMenu() {

        Scanner in = new Scanner(System.in);

        while (true) {

            //menu
            System.out.println();
            System.out.println("|--------QUIZ---------|");
            System.out.println("|                     |");
            System.out.println("|  1. Nowy quiz       |");
            System.out.println("|  2. Lista wyników   |");
            System.out.println("|  3. Wyjście         |");
            System.out.println("|                     |");
            System.out.println("|---------------------|");
            System.out.println("|");
            System.out.print("| Twój wybór: ");
            int chooser = in.nextInt();

            switch (chooser) {
                case 1: {
                    startNewQuiz();
                    break;
                }
                case 2: {
                    showResults();
                    break;
                }
                case 3: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Nie ma takiej opcji!");
                    break;
                }
            }
        }
    }

    public static void startNewQuiz() {
        Quiz quiz = new Quiz();
        Player player = new Player();
        Scanner in = new Scanner(System.in);
        List<Question> questions = quiz.readAllQuestions();

        System.out.print("Podaj swoje imię: ");
        player.setName(in.nextLine());

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Pytanie nr " + (i + 1) + ":");
            System.out.println(questions.get(i).toString());
            System.out.print("Podaj właściwą odpowiedz: ");
            String answer = in.nextLine();
            if (answer.equals(questions.get(i).getCorrectAnswer())) {
                System.out.println("BRAWO! To prawidłowa odpowiedz!");
                quiz.setNewScore();
            } else {
                System.out.println("Niestety to zła odpowiedz!");
            }
        }
        player.setScore(quiz.getScore());
        System.out.println("Twój wynik to: " + quiz.getScore() + "/" + questions.size());

        quiz.saveScore(player.getName(), player.getScore());

    }


    public static void showResults() {
        List<String> ranking = Quiz.getRanking();
        if (ranking != null) {
            for (String result : ranking) {
                System.out.println(result);
            }
        } else {
            System.out.println("Brak wyników!");
        }

        System.out.println();
    }


}
