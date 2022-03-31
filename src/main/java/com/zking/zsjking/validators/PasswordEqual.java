package com.zking.zsjking.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented //注解的注释加入到文档中
@Retention(RetentionPolicy.RUNTIME)  // 注解保留在运行的阶段
@Target({ElementType.TYPE,ElementType.FIELD})  // 注解目标对象是对象和方法
@Constraint(validatedBy = PasswordValidator.class)
public @interface PasswordEqual {
    int min() default 6;
    int max() default 16;
    String message() default "passwords are not equal";

    Class<?>[] groups() default  {};

    Class<? extends Payload>[] payload() default {};
    // 关联类
}
