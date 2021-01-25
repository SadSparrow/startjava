package com.statrjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return attempt;
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public void setNumber(int number) {
        numbers[attempt] = number;
        attempt++;
    }

    public int[] getNumbersArray() {
        return Arrays.copyOf(this.numbers, attempt);
    }

    public void cleanArray() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}