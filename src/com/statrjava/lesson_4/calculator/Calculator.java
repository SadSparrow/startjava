package com.statrjava.lesson_4.calculator;

public class Calculator {
    private int x;
    private int y;
    private char operation;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public int calculate() {
        int result = 0;
        switch (operation) {
            case '+':
                result = Math.addExact(x, y);
                break;
            case '-':
                result = Math.subtractExact(x, y);
                break;
            case '*':
                result = Math.multiplyExact(x, y);
                break;
            case '/':
                result = Math.floorDiv(x, y);
                break;
            case '%':
                result = Math.floorMod(x, y);
                break;
            case '^':
                result = (int) Math.pow(x, y);
                break;
        }
        return result;
    }
}
