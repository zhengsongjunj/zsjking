package com.zking.zsjking.sample.hero;

import com.zking.zsjking.sample.SkillImpl;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Diana implements SkillImpl {
    public Diana () {
        System.out.println("setting 注入！");
    }

    public void q() {
        System.out.println("dian q");
    }
    public void w() {
        System.out.println("dian w");
    }
    public void e() {
        System.out.println("dian e");
    }
    public void r() {
        System.out.println("dian r");
    }
}
