package tech.lvjiawen.demo.sample.hero;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import tech.lvjiawen.demo.sample.ISkill;

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
