import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerAnswer = "да";

        System.out.print("Введите имя игрока №1: ");
        Player firstPlayer = new Player(scan.nextLine());
        System.out.print("Введите имя игрока №2: ");
        Player secondPlayer = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);

        while (playerAnswer.equals("да")) {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [да/нет]: ");
                playerAnswer = scan.nextLine();
            } while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
        }
    }
}