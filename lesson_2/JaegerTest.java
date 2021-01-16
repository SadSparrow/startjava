public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerTyphoon = new Jaeger();
        Jaeger jaegerTango = new Jaeger();

        jaegerTyphoon.setModelName("Crimson Typhoon");
        jaegerTango.setModelName("Coyote Tango");
        jaegerTyphoon.setMark("Mark-4");
        jaegerTango.setMark("Mark-1");
        jaegerTyphoon.setOrigin("China");
        jaegerTango.setOrigin("Japan");

        System.out.println(jaegerTango.toString());
        System.out.println(jaegerTyphoon.toString());

        jaegerTyphoon.setEnergyCore("Midnight Orb 9");
        jaegerTango.setEnergyCore("Iso-thor reaction chamber");
        jaegerTyphoon.setHeight(76.2f);
        jaegerTango.setHeight(85.34f);

        jaegerTyphoon.drift();
        System.out.println(jaegerTango.activateWeapon());

        jaegerTango.setModelName("some new name");
        System.out.println(jaegerTango.getModelName());

        jaegerTyphoon.setHeight(-5);
        System.out.println(jaegerTyphoon.getHeight());
    }
}