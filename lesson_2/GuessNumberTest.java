import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerAnswer = "да";

        Player firstPlayer = new Player(scan.nextLine());
        Player secondPlayer = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);

        while (playerAnswer.equals("да")) {
            game.startGame();
            do {
                System.out.print("Хотите продолжить игру? [да/нет]: ");
                playerAnswer = scan.nextLine();
            } while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
        }
    }
}