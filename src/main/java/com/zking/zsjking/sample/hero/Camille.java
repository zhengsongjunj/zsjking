package com.zking.zsjking.sample.hero;

import com.zking.zsjking.sample.SkillImpl;
import org.springframework.stereotype.Component;

@Component
public class Camille implements SkillImpl {
    public void q() {
        System.out.println("Camille q");
    }
    public void w() {
        System.out.println("Camille w");
    }
    public void e() {
        System.out.println("Camille e");
    }
    public void r() {
        System.out.println("Camille r");
    }
}