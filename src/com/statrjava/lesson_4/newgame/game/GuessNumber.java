package com.statrjava.lesson_4.newgame.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player[] players;
    private int quizNumber;
    private final int countOfTry;

    public GuessNumber(Player[] players, int countOfTry) {
        this.players = players;
        this.countOfTry = countOfTry;
    }

    public void start() {
        quizNumber = new Random().nextInt(100) + 1;
        System.out.println(quizNumber);
        System.out.println("У вас " + countOfTry + " попыток");

        first:
        for (int i = 0; i < countOfTry; i++) {
            for (Player player : players) {
                if (makeMove(player)) {
                    break first;
                }
            }
        }
        for (Player player : players) {
            showEnteredNumbers(player);
            player.clear();
        }
    }

    private boolean makeMove(Player p) {
        inputNumber(p);
        return guessNumber(p);
    }

    private boolean guessNumber(Player p) {
        if (quizNumber != p.getNumber()) {
            System.out.println("Введенное игроком " + p.getName() + " число " + ((quizNumber < p.getNumber()) ? "больше" : "меньше") + " того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + p.getName() + " угадал число " + quizNumber + " с " + p.getAttempt() + " попытки");
        }
        if (p.getAttempt() == countOfTry && quizNumber != p.getNumber()) {
            System.out.println("у " + p.getName() + " закончились попытки");
        }
        return quizNumber == p.getNumber();
    }

    private void inputNumber(Player p) {
        System.out.print("Очередь игрока " + p.getName() + ": ");
        p.setNumber(new Scanner(System.in).nextInt());
    }

    private void showEnteredNumbers(Player p) {
        System.out.print("Числа игрока " + p.getName() + ": ");
        for (int number : p.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}