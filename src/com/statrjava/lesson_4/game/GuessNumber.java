package com.statrjava.lesson_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private int quizNumber;
    private int countOfTry = 10;

    public int getCountOfTry() {
        return countOfTry;
    }


    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        quizNumber = random.nextInt(100) + 1;

        for (int i = 0; i < countOfTry; i++) {
            if (makeMove(player1) || makeMove(player2)) {
                break;
            }
            if (i == countOfTry - 1) {
                System.out.println("у " + player1.getName() + " закончились попытки");
                System.out.println("у " + player2.getName() + " закончились попытки");
            }
        }
        showEnteredNumbers(player1);
        showEnteredNumbers(player2);
        player1.clear();
        player2.clear();
    }

    private boolean makeMove(Player p) {
        inputNumber(p);
        System.out.println("Введенное игроком " + p.getName() + " число " + ((quizNumber < p.getNumber()) ? "больше" : "меньше") + " того, что загадал компьютер");
        if (quizNumber == p.getNumber()) {
            System.out.println("Игрок " + p.getName() + " угадал число " + quizNumber + " с " + p.getAttempt() + " попытки");
        }
        return quizNumber == p.getNumber();
    }

    private void inputNumber(Player p) {
        System.out.print("Очередь игрока " + p.getName() + ": ");
        p.setNumber(scan.nextInt());
    }

    private void showEnteredNumbers(Player p) {
        for (int i : p.getNumbers()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}