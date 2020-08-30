package tech.lvjiawen.missyou.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.lvjiawen.missyou.sample.hero.Irelia;

@Configuration
public class HeroConfiguration {

    @Bean
    public ISkill irelia() {
        return new Irelia();
    }
}
