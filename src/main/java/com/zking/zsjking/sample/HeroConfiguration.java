package com.zking.zsjking.sample;

import com.zking.zsjking.sample.condition.CamilleCondition;
import com.zking.zsjking.sample.condition.DianaCondition;
import com.zking.zsjking.sample.hero.Camille;
import com.zking.zsjking.sample.hero.Diana;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {
    @Bean
    @ConditionalOnProperty(value="hero.name",havingValue="camille",matchIfMissing = true)
    public SkillImpl camille () {
        return new Camille();
    }

    @Bean
    @ConditionalOnProperty(value="hero.name",havingValue="diana")
    public SkillImpl diana () {
        return new Diana();
    }

}
