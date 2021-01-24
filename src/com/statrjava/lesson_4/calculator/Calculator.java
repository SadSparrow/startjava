package com.statrjava.lesson_4.calculator;

public class Calculator {
    private String mathString;
    private int x;
    private int y;
    private char operation;

    public Calculator(String mathString) {
        this.mathString = mathString;
        String[] s = mathString.split(" ");
        x = Integer.parseInt(s[0]);
        y = Integer.parseInt(s[2]);
        operation = s[1].charAt(0);
    }

    public int calculate() {
        switch (operation) {
            case '+':
                return Math.addExact(x, y);
            case '-':
                return Math.subtractExact(x, y);
            case '*':
                return Math.multiplyExact(x, y);
            case '/':
                return Math.floorDiv(x, y);
            case '%':
                return Math.floorMod(x, y);
            case '^':
                return (int) Math.pow(x, y);
        }
        return 0;
    }
}
