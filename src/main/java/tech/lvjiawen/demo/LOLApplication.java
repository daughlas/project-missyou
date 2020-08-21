package tech.lvjiawen.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import tech.lvjiawen.demo.sample.HeroConfiguration;
import tech.lvjiawen.demo.sample.ISkill;

@Import(HeroConfiguration.class)
public class LOLApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(LOLApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        ISkill iSkill = (ISkill) context.getBean("irelia");
        iSkill.r();
    }
}
