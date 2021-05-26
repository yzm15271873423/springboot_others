package com.yzm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: yzm
 * @Date: 2021/5/26 - 05 - 26 - 11:38
 * @Description: com.yzm.controller
 * @version: 1.0
 */
@Controller
public class LoginController {

    @RequestMapping("login")
    public String login(String username, HttpServletRequest req) {
        if (null != username && !"".equals(username)) {
            req.getSession().setAttribute("username", username);
            return "redirect:main.html";
        }

        return "redirect:login.html";
    }

}
