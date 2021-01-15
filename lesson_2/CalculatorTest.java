import java.util.Scanner;


public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String marker = "да";

        while (marker.equals("да")) {
            System.out.print("Введите первое число: ");
            calculator.setX(scan.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setOperation(scan.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setY(scan.nextInt());
            calculator.calcResult(calculator.getX(), calculator.getY(), calculator.getOperation());
            scan.nextLine();
            do {
                System.out.print("Хотите продолжить вычисления? [да/нет]: ");
                marker = scan.nextLine();
            } while (!marker.equals("да") && !marker.equals("нет"));
        }
    }
}
