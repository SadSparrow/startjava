public class MyFirstGame {
    public static void main(String[] args) {
        int quizNumber = 45;
        int personNumber = 50;

        while (quizNumber != personNumber) {
            if (quizNumber < personNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
            personNumber--;
        } else {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
            personNumber++;
        }
        }
        System.out.println("Вы угадали!");
    }
}
