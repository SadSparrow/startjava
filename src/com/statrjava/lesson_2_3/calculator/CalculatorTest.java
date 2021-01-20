package com.statrjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String playerAnswer = "да";

        while (playerAnswer.equals("да")) {
            System.out.print("Введите первое число: ");
            calculator.setX(scan.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setOperation(scan.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setY(scan.nextInt());
            calculator.calculate();
            scan.nextLine();
            do {
                System.out.print("Хотите продолжить вычисления? [да/нет]: ");
                playerAnswer = scan.nextLine();
            } while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
        }
    }
}
