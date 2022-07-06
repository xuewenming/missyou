package com.app.missyou.sample.annotation;

import com.app.missyou.sample.selector.LOLConfigurationSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Import(value = {LOLConfigurationSelector.class})
public @interface EnableLOLConfiguration {
}
