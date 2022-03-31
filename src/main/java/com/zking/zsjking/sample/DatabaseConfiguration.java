package com.zking.zsjking.sample;

import com.zking.zsjking.sample.database.MySQL;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {

//    @Value("${mysql.ip}")
    private String ip;

//    @Value("${mysql.port}")
    private Integer port;

    @Bean
    public ConnectImpl mysql() {
        return new MySQL(this.ip,this.port);
    }
}
