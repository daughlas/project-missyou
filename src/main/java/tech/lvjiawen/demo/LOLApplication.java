package tech.lvjiawen.demo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import tech.lvjiawen.demo.sample.EnableLOLConfiguration;
import tech.lvjiawen.demo.sample.ISkill;

@EnableLOLConfiguration
public class LOLApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(LOLApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        ISkill iSkill = (ISkill) context.getBean("irelia");
        iSkill.q();
    }
}
