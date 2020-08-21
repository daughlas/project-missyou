package tech.lvjiawen.demo.sample;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import tech.lvjiawen.demo.condition.DianaCondition;
import tech.lvjiawen.demo.condition.IreliaCondition;
import tech.lvjiawen.demo.sample.hero.Diana;
import tech.lvjiawen.demo.sample.hero.Irelia;

@Configuration
public class HeroConfiguration {

    @Bean
    @ConditionalOnMissingBean(name="mysql")
    public ISkill diana() {
        return new Diana("Diana", 18);
    }
}
