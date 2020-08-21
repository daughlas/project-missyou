package tech.lvjiawen.demo.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.lvjiawen.demo.sample.database.IConnect;
import tech.lvjiawen.demo.sample.database.MySql;

@Configuration
public class DatabaseConfiguration {
    @Value("${mysql.ip}")
    private String ip;
    @Value("${mysql.port}")
    private Integer port;

    @Bean
    public IConnect mysql() {
        return new MySql(this.ip, this.port);
    }
}
