package com.statrjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerTyphoon1 = new Jaeger("Crimson Typhoon", "Mark-4", "China");
        Jaeger jaegerTango1 = new Jaeger("Coyote Tango", "Mark-1", "Japan", "Iso-thor reaction chamber");

        System.out.println(jaegerTango1.toString());
        System.out.println(jaegerTyphoon1.toString());

        Jaeger jaegerTyphoon2 = new Jaeger("Crimson Typhoon", "Mark-4", "China", "Midnight Orb 9");
        Jaeger jaegerTango2 = new Jaeger("Coyote Tango", "Mark-1", "Japan", "Iso-thor reaction chamber", 85.34f);

        jaegerTyphoon1.drift();
        System.out.println(jaegerTango2.activateWeapon());

        Jaeger jaeger3 = new Jaeger("Name", "Mark", "China", "Energy core", -5);

        System.out.println(jaeger3.getHeight());
    }
}