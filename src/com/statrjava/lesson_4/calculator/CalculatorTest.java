package com.statrjava.lesson_4.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String playerAnswer = "да";

        while (playerAnswer.equals("да")) {
            System.out.print("Введите математическое выражение: ");
            String[] strings = scan.nextLine().split(" ");
            calculator.setX(Integer.parseInt(strings[0]));
            calculator.setOperation(strings[1].charAt(0));
            calculator.setY(Integer.parseInt(strings[2]));
            System.out.println(calculator.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [да/нет]: ");
                playerAnswer = scan.nextLine();
            } while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
        }
    }
}
