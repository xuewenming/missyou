package com.app.missyou.validators;

import com.app.missyou.dto.PersonDTO;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 密码校验类
 */
public class PasswordValidator implements ConstraintValidator<PasswordEqual, PersonDTO> {

    private int min;
    private int max;

    @Override
    public void initialize(PasswordEqual constraintAnnotation) {
        this.min = constraintAnnotation.minLength();
        this.max = constraintAnnotation.maxLength();
    }

    @Override
    public boolean isValid(PersonDTO personDTO, ConstraintValidatorContext constraintValidatorContext) {
        if (personDTO == null) {
            return false;
        }
        String password1 = personDTO.getPassword1();
        String password2 = personDTO.getPassword2();
        if (StringUtils.isEmpty(password1) || StringUtils.isEmpty(password2)) {
            return false;
        }
        int length1 = password1.length();



        return personDTO.getPassword1().equals(personDTO.getPassword2());
    }

    /**
     * 校验密码长度
     * @param length
     * @return java.lang.Boolean
     */
    private Boolean checkPasswordLength(int length) {
        return true;
    }


}
