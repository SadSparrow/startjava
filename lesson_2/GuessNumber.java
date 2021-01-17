import java.util.Scanner;

public class GuessNumber {

    public static void guessNumber(Player p1, Player p2, int quizNumber) {
        while (quizNumber != p1.getPlayerNumber() && quizNumber != p2.getPlayerNumber()) {
            if (quizNumber != p1.getPlayerNumber()) {
                guessNumber(p1, quizNumber);
            }
            if (quizNumber != p2.getPlayerNumber()) {
                guessNumber(p2, quizNumber);
            }
        }
        if (quizNumber == p1.getPlayerNumber()) {
            System.out.println("Игрок " + p1.getName() + " угадал число!");
        } else {
            System.out.println("Игрок " + p2.getName() + " угадал число!");
        }
    }

    private static void guessNumber(Player p, int quizNumber) {
        Scanner scan = new Scanner(System.in);
        if (quizNumber < p.getPlayerNumber()) {
            System.out.println("Введенное игроком " + p.getName() + " число больше того, что загадал компьютер");
            p.setPlayerNumber(scan.nextInt());
        } else if (quizNumber > p.getPlayerNumber()) {
            System.out.println("Введенное игроком " + p.getName() + " число меньше того, что загадал компьютер");
            p.setPlayerNumber(scan.nextInt());
        }
    }
}