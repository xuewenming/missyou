package com.app.missyou.sample.config;

import com.app.missyou.sample.service.IConnect;
import com.app.missyou.sample.service.MySql;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 数据配置类
 */
@Configurable
@Component
public class DatabaseConfiguration {

    @Value("${test.sample.mysql.url}")
    private String url;
    @Value("${test.sample.mysql.port}")
    private Integer port;

    @Bean
    public IConnect mysql() {
        return new MySql(this.url, this.port);
    }
}
