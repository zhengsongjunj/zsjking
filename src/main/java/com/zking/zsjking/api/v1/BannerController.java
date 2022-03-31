package com.zking.zsjking.api.v1;
import com.zking.zsjking.dto.PersonDTO;
import com.zking.zsjking.model.Banner;
import com.zking.zsjking.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;

@RestController
@RequestMapping("/banner")
@Validated
public class BannerController {
    @Autowired
    private BannerService bannerService;


    @GetMapping("/name/{name}")
    public Banner getByName(@PathVariable String name){
        Banner banner =  bannerService.getByName(name);
        return banner;
    }

}
