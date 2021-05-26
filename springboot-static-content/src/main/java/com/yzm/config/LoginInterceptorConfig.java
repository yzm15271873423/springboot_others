package com.yzm.config;

import com.yzm.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: yzm
 * @Date: 2021/5/26 - 05 - 26 - 11:47
 * @Description: com.yzm.config
 * @version: 1.0
 */
@Configuration
public class LoginInterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/login.html", "/login", "/img/**", "/js/**", "/css/**", "/favicon.ico");
    }
}
