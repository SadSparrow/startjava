package com.statrjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerAnswer = "да";
        Calculator calculator = new Calculator();

        while (playerAnswer.equals("да")) {
            System.out.print("Введите математическое выражение: ");
            System.out.println(calculator.calculate(scan.nextLine()));
            do {
                System.out.print("Хотите продолжить вычисления? [да/нет]: ");
                playerAnswer = scan.nextLine();
            } while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
        }
    }
}
