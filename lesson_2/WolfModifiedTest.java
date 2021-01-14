public class WolfModifiedTest {
    public static void main(String[] args) {
        WolfModified wolf = new WolfModified();
        wolf.setGender("male");
        wolf.setNickname("Wolf");
        wolf.setWeight(10);
        wolf.setAge(5);
        wolf.setColor("Black");

        System.out.println(wolf.getGender());
        System.out.println(wolf.getNickname());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getColor());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}