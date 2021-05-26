package com.yzm.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: yzm
 * @Date: 2021/5/26 - 05 - 26 - 11:43
 * @Description: com.yzm.interceptor
 * @version: 1.0
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object username = request.getSession().getAttribute("username");
        if (null != username) {
            return true;
        }

        response.sendRedirect("login.html");
        return false;
    }
}
