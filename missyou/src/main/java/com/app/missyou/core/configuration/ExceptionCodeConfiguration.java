package com.app.missyou.core.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 错误码配置类
 */
@Component
@ConfigurationProperties(prefix = "app")
@PropertySource(value = "classpath:config/exception-code.properties")
@Getter
@Setter
public class ExceptionCodeConfiguration {

    private ExceptionCodeConfiguration() {}

    private Map<Integer, String> codes = new HashMap<>();

    /**
     * 获取message消息
     * @date 2022/7/8 23:16
     * @param code
     * @return java.lang.String
     */
    public String getMessage(Integer code) {
        return codes.get(code);
    }

}
