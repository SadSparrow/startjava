import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstPlayerName = scan.nextLine();
        String secondPlayerName = scan.nextLine();
        Random random = new Random();
        int quizNumber;
        String playerAnswer = "да";

        Player firstPlayer = new Player(firstPlayerName, scan.nextInt());
        Player secondPlayer = new Player(secondPlayerName, scan.nextInt());

        while (playerAnswer.equals("да")) {
            quizNumber = random.nextInt(100) + 1;
            GuessNumber.guessNumber(firstPlayer, secondPlayer, quizNumber);
            do {
                System.out.print("Хотите продолжить игру? [да/нет]: ");
                playerAnswer = scan.nextLine();
            } while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
        }
    }
}