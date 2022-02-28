package com.zking.zsjking.api.v1;
import com.zking.zsjking.sample.hero.Diana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.DataInput;
import java.io.IOException;

@RestController
@RequestMapping("/v1/banner")
public class BannerController {
    //    @Autowired
    private Diana diana;

    @Autowired
    public void setDiana(Diana diana) {
        this.diana = diana;
    }

    @GetMapping("/test")
    public String test()  {
        diana.r();
        return "hello world!";
    }
}
