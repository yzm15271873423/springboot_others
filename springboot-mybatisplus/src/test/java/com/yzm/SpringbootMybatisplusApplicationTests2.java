package com.yzm;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yzm.pojo.Dept;
import com.yzm.service.DeptService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

//@SpringBootTest
@DisplayName("junit5单元测试")
class SpringbootMybatisplusApplicationTests2 {

    @Autowired
    private DeptService deptService;

    @Timeout(value = 100,unit = TimeUnit.MILLISECONDS)
    //@RepeatedTest(3)
    @DisplayName("junit测试方法一")
    @Test
    public void test1() throws InterruptedException {
        System.out.println("a");
        //Thread.sleep(200);
        System.out.println(deptService);
    }

    @Disabled
    @DisplayName("junit测试方法二")
    @Test
    public void test2() {
        System.out.println("b");

    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach");
    }

    @AfterEach
    public void AfterEach(){
        System.out.println("AfterEach");
    }

    @BeforeAll
    public static void BeforeAll(){
        System.out.println("张三");
    }

    @AfterAll
    public static void AfterAll(){
        System.out.println("AfterAll");
    }

}
