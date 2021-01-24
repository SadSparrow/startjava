package com.statrjava.lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private int quizNumber;
    public int countOfTry = 10;
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        quizNumber = random.nextInt(100) + 1;

        player1.cleanArray();
        player2.cleanArray();

        for (int i = 0; i < countOfTry; i++) {
            inputNumber(player1);
            if (guessNumber(player1)) {
                break;
            }
            inputNumber(player2);
            if (guessNumber(player2)) {
                break;
            }
            if (i == countOfTry - 1) {
                System.out.println("у " + player1.getName() + " закончились попытки");
                System.out.println("у " + player2.getName() + " закончились попытки");
            }
        }
        System.out.println(player1.getNumbersToString());
        System.out.println(player2.getNumbersToString());
    }

    private void inputNumber(Player p) {
        System.out.print("Очередь игрока " + p.getName() + ": ");
        p.setNumber(scan.nextInt());
    }

    private boolean guessNumber(Player p) {
        String sBigger = "Введенное игроком " + p.getName() + " число больше того, что загадал компьютер";
        String sSmaller = "Введенное игроком " + p.getName() + " число меньше того, что загадал компьютер";
        String sWin = "Игрок " + p.getName() + " угадал число " + quizNumber + " с " + p.getIndex() + " попытки";
        
        String result = (quizNumber < p.getNumber()) ? sBigger : (quizNumber > p.getNumber() ? sSmaller :  sWin);
        System.out.println(result);
        return quizNumber == p.getNumber();
    }
}