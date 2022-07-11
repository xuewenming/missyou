package com.app.missyou.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 密码校验注解
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@Documented
@Constraint(validatedBy = PasswordValidator.class)
public @interface PasswordEqual {


    int minLength() default 8;

    int maxLength() default 32;
    /**
     * 消息文本
     **/
    String message() default "passwords are not equal";

    /**默认规则**/
    Class<?>[] groups() default {};

    /**默认规则**/
    Class<? extends Payload>[] payload() default {};
}
