import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player playerFirst;
    private Player playerSecond;
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player playerFirst, Player playerSecond) {
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;
    }

    public void startGame() {
        Random random = new Random();
        int quizNumber = random.nextInt(100) + 1;
        while (quizNumber != playerFirst.getNumber() && quizNumber != playerSecond.getNumber()) {
            System.out.print("Очередь игрока " + playerFirst.getName() + ": ");
            playerFirst.setNumber(scan.nextInt());
            guessNumber(playerFirst, quizNumber);
            if (quizNumber == playerFirst.getNumber()) {
                break;
            }
            System.out.print("Очередь игрока " + playerSecond.getName() + ": ");
            playerSecond.setNumber(scan.nextInt());
            guessNumber(playerSecond, quizNumber);
        }
    }

    private void guessNumber(Player p, int quizNumber) {
        if (quizNumber < p.getNumber()) {
            System.out.println("Введенное игроком " + p.getName() + " число больше того, что загадал компьютер");
        } else if (quizNumber > p.getNumber()) {
            System.out.println("Введенное игроком " + p.getName() + " число меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + p.getName() + " угадал число!");
        }
    }
}