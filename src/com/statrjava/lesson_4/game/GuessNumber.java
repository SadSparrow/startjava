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

        for (int i = 0; i < countOfTry; i++) {
            if (guessLogic(player1) || guessLogic(player2)){
                break;
            }
            if (i == countOfTry - 1) {
                System.out.println("у " + player1.getName() + " закончились попытки");
                System.out.println("у " + player2.getName() + " закончились попытки");
            }
        }
        getNumbersToString(player1);
        getNumbersToString(player2);
        player1.cleanArray();
        player2.cleanArray();
    }

    private boolean guessLogic(Player p) {
        inputNumber(p);
        return guessNumber(p);

    }

    private void inputNumber(Player p) {
        System.out.print("Очередь игрока " + p.getName() + ": ");
        p.setNumber(scan.nextInt());
    }

    private boolean guessNumber(Player p) {
        String s = (quizNumber < p.getNumber()) ? "больше" : "меньше";
        String message = "Введенное игроком " + p.getName() + " число " + s + " того, что загадал компьютер";

        if (quizNumber < p.getNumber()) {
            System.out.println(message);
        } else if (quizNumber > p.getNumber()) {
            System.out.println(message);
        } else {
            System.out.println("Игрок " + p.getName() + " угадал число " + quizNumber + " с " + p.getIndex() + " попытки");
        }
        return quizNumber == p.getNumber();
    }

    private void getNumbersToString(Player p) {
        StringBuilder sb = new StringBuilder();
        int[] numbers = p.getNumbersArray();
        for (int i : numbers) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }
}