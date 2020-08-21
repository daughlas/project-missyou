package tech.lvjiawen.demo.sample.hero;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import tech.lvjiawen.demo.sample.ISkill;

public class Diana implements ISkill {
    private String skillName = "Dianna R";
    private String name;
    private int age;

    public Diana(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Diana() {
        System.out.println("Diana init");
    }


    public void q() {
        System.out.println("Diana Q");
    }

    public void w() {
        System.out.println("Diana W");
    }

    public void e() {
        System.out.println("Diana E");
    }

    public void r() {
        System.out.println("Diana R");
    }
}
