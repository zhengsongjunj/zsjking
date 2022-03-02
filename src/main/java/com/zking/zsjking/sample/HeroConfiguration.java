package com.zking.zsjking.sample;

import com.zking.zsjking.sample.hero.Camille;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {
    @Bean
    public SkillImpl camille () {
        return new Camille();
    }
}
