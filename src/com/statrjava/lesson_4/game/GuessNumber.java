package com.statrjava.lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player playerFirst;
    private final Player playerSecond;
    private int quizNumber;
    public int countOfTry = 10;
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player playerFirst, Player playerSecond) {
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;
    }

    public void start() {
        Random random = new Random();
        quizNumber = random.nextInt(100) + 1;

        playerFirst.cleanArray();
        playerSecond.cleanArray();

        for (int i = 0; i < countOfTry; i++) {
            playQueue(playerFirst);
            if (guessNumber(playerFirst)) {
                break;
            }
            playQueue(playerSecond);
            if (guessNumber(playerSecond)) {
                break;
            }
            if (i == countOfTry - 1) {
                gameOver(playerFirst);
                gameOver(playerSecond);
            }
        }
        playerFirst.getNumbersToString();
        playerSecond.getNumbersToString();
    }

    private boolean guessNumber(Player p) {
        if (quizNumber < p.getNumber()) {
            System.out.println("Введенное игроком " + p.getName() + " число больше того, что загадал компьютер");
        } else if (quizNumber > p.getNumber()) {
            System.out.println("Введенное игроком " + p.getName() + " число меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + p.getName() + " угадал число " + quizNumber + " с " + p.getIndex() + " попытки");
        }
        return quizNumber == p.getNumber();
    }

    private void playQueue(Player p) {
        System.out.print("Очередь игрока " + p.getName() + ": ");
        p.setNumber(scan.nextInt());
    }

    private void gameOver(Player p) {
        System.out.println("у " + p.getName() + " закончились попытки");
    }
}