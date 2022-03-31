package com.zking.zsjking.validators;

import com.zking.zsjking.dto.PersonDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


// 第一个是注解的类型，第二个参数是自定义注解修饰的目标类型（你这个注解打到哪里，就写什么类型,打到类上面就是类的类型，打到字段上面就是对应字段的类型）
public class PasswordValidator implements ConstraintValidator<PasswordEqual, PersonDTO> {
    private int min;
    private int max;
    @Override
    public void initialize(PasswordEqual constraintAnnotation) {
        //获取到校验注解的参数
        this.min = constraintAnnotation.max();
        this.max = constraintAnnotation.min();
    }

    @Override
    public boolean isValid(PersonDTO personDTO, ConstraintValidatorContext constraintValidatorContext) {
        
        //获取类的成员变量
        String password1 = personDTO.getPassword1();
        String password2 = personDTO.getPassword2();
        return password1.equals(password2);
    }
}
