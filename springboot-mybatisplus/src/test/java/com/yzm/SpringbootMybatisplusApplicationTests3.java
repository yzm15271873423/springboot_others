package com.yzm;

import com.yzm.service.DeptService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

//@SpringBootTest
@DisplayName("junit5单元测试")
class SpringbootMybatisplusApplicationTests3 {

    @Autowired
    private DeptService deptService;

    @DisplayName("简单断言1")
    @Test
    public void testAssertions1()  {
       int num = add(2,3);

       Assertions.assertEquals(5,num,"预测出错");
    }

    public int add(int a,int b){
        return a+b;
    }


    @DisplayName("简单断言2")
    @Test
    public void testAssertions2(){
        String s =new String("xxx");
        String s2="xxx";
        Assertions.assertSame(s,s2,"String对象不一样");
    }
    // 组合断言
    @DisplayName("组合断言")
    @Test
    public void testAssertAll(){
        Assertions.assertAll("AssertAll",
                ()-> Assertions.assertTrue(true),
                ()-> Assertions.assertEquals(1,1));
    }
    // 异常断言 认为应该会出现异常
    @DisplayName("异常断言")
    @Test
    public void testAssertException(){
        Assertions.assertThrows(ArithmeticException.class, ()->{ int i=1/0;}, "没有抛出异常");
    }
    // 超时断言 判断有没有超时
    @DisplayName("超时断言")
    @Test
    public void testAssertTimeOut(){
        Assertions.assertTimeout(Duration.ofMillis(1000),()-> Thread.sleep(5000));
    }
    // 快速失败
    @DisplayName("快速失败")
    @Test
    public void testFail(){
        if(null==deptService){
            Assertions.fail("测试 失败");
        }
    }

}
