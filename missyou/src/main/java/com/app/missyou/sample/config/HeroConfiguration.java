package com.app.missyou.sample.config;

import com.app.missyou.sample.condition.LreliaCondition;
import com.app.missyou.sample.service.ISkill;
import com.app.missyou.sample.service.Irelia;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * 英雄配置类
 */
@Component
@Configurable
public class HeroConfiguration {

    // 服务类上不能在加入@Component
    @Bean
    @Conditional(value = LreliaCondition.class)
    public ISkill lrelia() {
        return new Irelia();
    }
}
