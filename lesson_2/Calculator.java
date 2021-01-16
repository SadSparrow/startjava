public class Calculator {
    private int x;
    private int y;
    private char operation = '+';

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate() {
        switch (operation) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;
            case '%':
                System.out.println(x % y);
                break;
            case '^':
                int result = 1;
                for (int i = 1; i <= y; i++) {
                    result *= x;
                }
                System.out.println(result);
                break;
        }
    }
}