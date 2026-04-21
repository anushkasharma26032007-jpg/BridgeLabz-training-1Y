package com.gla.LamdaExpression;
interface LightAction {
    void perform();
}

public class SM {

    public static void main(String[] args) {

        LightAction motion = () -> System.out.println("Lights ON (Motion detected)");
        LightAction night = () -> System.out.println("Dim Lights ON (Night mode)");
        LightAction voice = () -> System.out.println("Lights OFF (Voice command)");

        motion.perform();
        night.perform();
        voice.perform();
    }
}

