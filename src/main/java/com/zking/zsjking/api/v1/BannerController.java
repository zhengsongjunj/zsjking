package com.zking.zsjking.api.v1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
// 加上注解他就变成了一个构造器
public class BannerController {
    // MVC SpringMVC
    // Controller Model View
    // 一个控制器下面有多个路由控制的方法

    @GetMapping("/test")
    @ResponseBody
    // get 请求 test执行当前方法
    public String test(HttpServletResponse response)  {
        // response.getWriter().write("hello world");
        return "hello world!";
    }
}
