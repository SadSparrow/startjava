package com.statrjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int index = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public int getNumber() {
        return numbers[index - 1];
    }

    public void setNumber(int number) {
        numbers[index] = number;
        index++;
    }

    public String getNumbersToString() {
        StringBuilder sb = new StringBuilder();
        int[] numbers = Arrays.copyOf(this.numbers, index);
        for (int i : numbers) {
            sb.append(i).append(" ");
        }
        return sb.toString();
    }

    public void cleanArray() {
        Arrays.fill(numbers, 0, index, 0);
        index = 0;
    }
}