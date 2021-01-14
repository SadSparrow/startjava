public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "male";
        wolf.nickname = "Wolf";
        wolf.weight = 10;
        wolf.age = 5;
        wolf.color = "Black";

        System.out.println(wolf.gender);
        System.out.println(wolf.nickname);
        System.out.println(wolf.weight);
        System.out.println(wolf.age);
        System.out.println(wolf.color);

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}