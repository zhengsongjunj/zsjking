package com.zking.zsjking.dto;


import com.zking.zsjking.validators.PasswordEqual;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Getter
@Setter
@PasswordEqual
public class PersonDTO {
    @Length(min = 2 , max = 10 , message = "字符串长度必须大于2且小于10")
    private String name;

    private Integer age;

//    @Valid
//    private SchoolDTO schoolDTO;

    private String password1;
    private String password2;
}
