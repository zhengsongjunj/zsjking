package com.zking.zsjking.sample;

import com.zking.zsjking.sample.condition.CamilleCondition;
import com.zking.zsjking.sample.condition.DianaCondition;
import com.zking.zsjking.sample.hero.Camille;
import com.zking.zsjking.sample.hero.Diana;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {
    @Bean
    @Conditional(CamilleCondition.class) //true
    public SkillImpl camille () {
        return new Camille();
    }

    @Bean
    @Conditional(DianaCondition.class) //false
    public SkillImpl diana () {
        return new Diana();
    }

//    @Bean
//    public SkillImpl irelia () {
//        return new Irelia();
//    }
}
