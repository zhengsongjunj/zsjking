package com.zking.zsjking.api.v1;
import com.zking.zsjking.dto.PersonDTO;
import com.zking.zsjking.dto.Test;
import com.zking.zsjking.exception.http.ForbiddenException;
import com.zking.zsjking.exception.http.NotFoundException;
import com.zking.zsjking.sample.ConnectImpl;
import com.zking.zsjking.sample.SkillImpl;
import com.zking.zsjking.sample.hero.Diana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;
import java.io.DataInput;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/banner")
public class BannerController {
    @Autowired
    private SkillImpl skillImpl;

    @Autowired
    private ConnectImpl connect;

    @GetMapping("/test/{id1}")
    public String test(@PathVariable(name="id1") Integer id,@RequestParam String name) {
        skillImpl.r();

        throw new ForbiddenException(10000);
//        throw new Exception("这里错了");
//        return "hello world!";
    }
    @PostMapping("/test")
    public String test(@RequestBody PersonDTO person) {
        System.out.println(person);
        Test test = Test.builder()
                .TestAge(17)
                .TestName("hello")
                .build();
        return "sss";
    };
}
