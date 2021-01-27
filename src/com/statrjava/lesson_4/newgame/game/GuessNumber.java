package com.statrjava.lesson_4.newgame.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player[] players;
    private int quizNumber;
    private int countOfTry;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public int getCountOfTry() {
        return countOfTry;
    }

    public void setCountOfTry(int countOfTry) {
        this.countOfTry = countOfTry;
    }

    public void start() {
        quizNumber = new Random().nextInt(100) + 1;

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
        if (quizNumber != p.getNumber()) {
            System.out.println("Введенное игроком " + p.getName() + " число " + ((quizNumber < p.getNumber()) ? "больше" : "меньше") + " того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + p.getName() + " угадал число " + quizNumber + " с " + p.getAttempt() + " попытки");
        }
        if (p.getAttempt() == countOfTry) {
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