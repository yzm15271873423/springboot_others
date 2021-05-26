package com.yzm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: yzm
 * @Date: 2021/5/26 - 05 - 26 - 10:51
 * @Description: com.yzm.controller
 * @version: 1.0
 */
@Controller
public class MyController {

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "index";
    }
}
