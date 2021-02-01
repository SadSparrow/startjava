package com.statrjava.lesson_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private int quizNumber;
    private int countOfTry = 10;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        quizNumber = new Random().nextInt(100) + 1;
        System.out.println("У вас " + countOfTry + " попыток");
        for (int i = 0; i < countOfTry; i++) {
            if (makeMove(player1) || makeMove(player2)) {
                break;
            }
        }
        showEnteredNumbers(player1);
        showEnteredNumbers(player2);
        player1.clear();
        player2.clear();
    }

    private boolean makeMove(Player p) {
        inputNumber(p);
        if (p.getAttempt() == 10) {
            System.out.println("у " + p.getName() + " закончились попытки");
        }
        return guessNumber(p);
    }

    private boolean guessNumber(Player p) {
        if (quizNumber != p.getNumber()) {
            System.out.println("Введенное игроком " + p.getName() + " число " + ((quizNumber < p.getNumber()) ? "больше" : "меньше") + " того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + p.getName() + " угадал число " + quizNumber + " с " + p.getAttempt() + " попытки");
        }
        return quizNumber == p.getNumber();
    }

    private void inputNumber(Player p) {
        System.out.print("Очередь игрока " + p.getName() + ": ");
        p.setNumber(new Scanner(System.in).nextInt());
    }

    private void showEnteredNumbers(Player p) {
        for (int number : p.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}