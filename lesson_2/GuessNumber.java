import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player playerFirst;
    private Player playerSecond;
    private int quizNumber;
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
            if (guessNumber(playerFirst)) {
                break;
            }
            System.out.print("Очередь игрока " + playerSecond.getName() + ": ");
            playerSecond.setNumber(scan.nextInt());
            if (guessNumber(playerSecond)) {
                break;
            }
        }
    }

    private boolean guessNumber(Player p) {
        if (quizNumber < p.getNumber()) {
            System.out.println("Введенное игроком " + p.getName() + " число больше того, что загадал компьютер");
        }
        if (quizNumber > p.getNumber()) {
            System.out.println("Введенное игроком " + p.getName() + " число меньше того, что загадал компьютер");
        }
        if (quizNumber == p.getNumber()) {
            System.out.println("Игрок " + p.getName() + " угадал число!");
        }
        return quizNumber == p.getNumber();
    }
}