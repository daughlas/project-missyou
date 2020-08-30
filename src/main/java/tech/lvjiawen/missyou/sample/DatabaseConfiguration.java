package tech.lvjiawen.missyou.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import tech.lvjiawen.missyou.sample.database.IConnect;
import tech.lvjiawen.missyou.sample.database.MySQL;

@Configuration
public class DatabaseConfiguration {
//    @Value("${mysql.ip}")
    private String ip;
//    @Value("${mysql.port}")
    private Integer port;

//    @Bean
    public IConnect mysql() {
        return new MySQL(this.ip, this.port);
    }
}
