package com.zking.zsjking.sample.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
// 条件类（必须实现Condition条件接口）
public class DianaCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 如果返回true ， 就会加入到容器中，如果返回false，就不会加入到容器中
        return false;
    }
}
