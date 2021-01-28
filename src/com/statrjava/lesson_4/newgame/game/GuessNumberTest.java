package com.statrjava.lesson_4.newgame.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumberTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Укажите количество игроков: ");
        int countOfPlayers = Integer.parseInt(reader.readLine());
        Player[] players = new Player[countOfPlayers];

        for (int i = 0; i < countOfPlayers; i++) {
            System.out.print("Введите имя игрока №" + (i + 1) + ": ");
            players[i] = new Player(reader.readLine());
        }
        System.out.print("Введите количество попыток: ");
        GuessNumber game = new GuessNumber(players, Integer.parseInt(reader.readLine()));
        String playerAnswer = "да";

        while (playerAnswer.equals("да")) {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [да/нет]: ");
                playerAnswer = reader.readLine();
            } while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
        }
    }
}