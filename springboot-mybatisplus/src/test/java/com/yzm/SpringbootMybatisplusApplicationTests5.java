package com.yzm;

import com.yzm.service.DeptService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.EmptyStackException;
import java.util.Stack;

@DisplayName("嵌套测试")
@SpringBootTest
class SpringbootMybatisplusApplicationTests5 {


    @DisplayName("out测试方法1")
    @Test
    public void test1() {
        System.out.println("outtest1");

    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("outbeforeEach");
    }

    @AfterEach
    public void AfterEach(){
        System.out.println("outAfterEach");
    }

    @Nested
    class Inner{
        @DisplayName("inner测试方法1")
        @Test
        public void innertest1() {
            System.out.println("innertest1");

        }

        @BeforeEach
        public void innerbeforeEach(){
            System.out.println("innerbeforeEach");
        }

        @AfterEach
        public void innerAfterEach(){
            System.out.println("innerAfterEach");
        }
    }


}
