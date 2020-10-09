package tech.lvjiawen.missyou.optional;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.Optional;

public class OptionalTest {
    @Test
    public void testCreateOptional() {
        // 不能对空值进行操作
//        Optional<String> empty = Optional.empty();
//        empty.get();
        // 不能给 of 传空值
//        Optional<String> t1 = Optional.of(null);
        Optional<String> t2 = Optional.ofNullable(null);
    }

    @Test
    public void testUseOptional() {
        Optional<String> t2 = Optional.ofNullable(null);
        // optional 取值的时候就报错了，而不是把 null 赋值给 s，空指针是一个隐藏性的错误
        String s = t2.get();
    }

    @Test
    public void testUseOptional2() {
        Optional<String> t2 = Optional.ofNullable("a");
        t2.ifPresent(t -> System.out.println("123"));
    }

    @Test
    public void testUseOptional3() {
        Optional<String> t2 = Optional.ofNullable(null);
        Optional<String> t3 = Optional.ofNullable("a");

        String s1 = t2.orElse("默认值");
        System.out.println(s1);

        String s2 = t3.orElse("默认值");
        System.out.println(s2);
    }

    @Test
    public void testOptionalChain() {
        Optional<String> t2 = Optional.ofNullable("a");

        String s = t2.orElse("默认值");

        String s1 = t2.map(t -> t + "b").orElse("c");
        System.out.println(s1);

        t2.map(t -> t + "b").ifPresent(System.out::println);
    }
}
