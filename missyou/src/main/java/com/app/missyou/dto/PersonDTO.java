package com.app.missyou.dto;

import com.app.missyou.validators.PasswordEqual;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import java.io.Serializable;


@NoArgsConstructor
@Getter
@Setter
@PasswordEqual(message = "两次密码输入不一致")
public class PersonDTO implements Serializable {


    private Integer id;

    @Length(min = 3, max = 10, message = "")
    private String name;

    @Valid
    private SchoolDTO schoolDTO;

    private String password1;

    private String password2;

}
