package com.zking.zsjking.sample.hero;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Diana {
    public Diana () {
        System.out.println("我被实例化了！");
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
