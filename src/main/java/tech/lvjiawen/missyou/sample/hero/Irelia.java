package tech.lvjiawen.missyou.sample.hero;

import tech.lvjiawen.missyou.sample.ISkill;

public class Irelia implements ISkill {
    public Irelia() {
        System.out.println("Irelia init");
    }
    public void q() {
        System.out.println("Irelia Q");
    }

    public void w() {
        System.out.println("Irelia W");
    }

    public void e() {
        System.out.println("Irelia E");
    }

    public void r() {
        System.out.println("Irelia R");
    }
}
