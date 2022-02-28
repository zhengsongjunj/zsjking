package com.zking.zsjking.sample.hero;

import com.zking.zsjking.sample.SkillImpl;
import org.springframework.stereotype.Component;

@Component
public class Irelia implements SkillImpl {
    public void q() {
        System.out.println("Irelia q");
    }
    public void w() {
        System.out.println("Irelia w");
    }
    public void e() {
        System.out.println("Irelia e");
    }
    public void r() {
        System.out.println("Irelia r");
    }
}
