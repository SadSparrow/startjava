package com.statrjava.lesson_4.calculator;

public class Calculator {

    public int calculate(String mathString) {
        String[] s = mathString.split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[2]);
        char operation = s[1].charAt(0);

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
