package com.yzm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: yzm
 * @Date: 2021/5/26 - 05 - 26 - 18:46
 * @Description: com.yzm.controller
 * @version: 1.0
 */
@Controller
public class MyController {

    @RequestMapping("index")
    public String index(){
        return "index.html";
    }
}
