import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player playerFirst;
    private Player playerSecond;
    int quizNumber;
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player playerFirst, Player playerSecond) {
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;
    }

    public void start() {
        Random random = new Random();
        quizNumber = random.nextInt(100) + 1;

        while (true) {
            System.out.print("Очередь игрока " + playerFirst.getName() + ": ");
            playerFirst.setNumber(scan.nextInt());
            if (guessNumber(playerFirst, quizNumber)) {
                break;
            }
            System.out.print("Очередь игрока " + playerSecond.getName() + ": ");
            playerSecond.setNumber(scan.nextInt());
            if (guessNumber(playerSecond, quizNumber)) {
                break;
            }
        }
    }

    private boolean guessNumber(Player p, int quizNumber) {
        if (quizNumber < p.getNumber()) {
            System.out.println("Введенное игроком " + p.getName() + " число больше того, что загадал компьютер");
            return false;
        } else if (quizNumber > p.getNumber()) {
            System.out.println("Введенное игроком " + p.getName() + " число меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Игрок " + p.getName() + " угадал число!");
        }
        return true;
    }
}