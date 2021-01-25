package com.statrjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя игрока №1: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя игрока №2: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        System.out.println("У вас " + game.countOfTry + " попыток");
        String playerAnswer = "да";

        while (playerAnswer.equals("да")) {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [да/нет]: ");
                playerAnswer = scan.nextLine();
            } while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
        }
    }
}