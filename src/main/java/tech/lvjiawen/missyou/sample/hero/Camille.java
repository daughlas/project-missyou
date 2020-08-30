package tech.lvjiawen.missyou.sample.hero;

import tech.lvjiawen.missyou.sample.ISkill;

public class Camille implements ISkill {

    public Camille() {
        System.out.println("Camille init");
    }

    public void q() {
        System.out.println("Camille Q");
    }

    public void w() {
        System.out.println("Camille W");
    }

    public void e() {
        System.out.println("Camille E");
    }

    public void r() {
        System.out.println("Camille R");
    }
}
