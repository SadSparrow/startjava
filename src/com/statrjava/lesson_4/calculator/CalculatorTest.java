package com.statrjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerAnswer = "да";

        while (playerAnswer.equals("да")) {
            System.out.print("Введите математическое выражение: ");
            Calculator calculator = new Calculator(scan.nextLine());
            System.out.println(calculator.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [да/нет]: ");
                playerAnswer = scan.nextLine();
            } while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
        }
    }
}
