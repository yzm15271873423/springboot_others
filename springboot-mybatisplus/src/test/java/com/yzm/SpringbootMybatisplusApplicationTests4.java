package com.yzm;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yzm.pojo.Dept;
import com.yzm.service.DeptService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@DisplayName("junit5前置条件断言")
@SpringBootTest
class SpringbootMybatisplusApplicationTests4 {

    @Autowired
    private DeptService deptService;

    @DisplayName("测试前提条件")
    @Test
    public void testAssumptions(){
        // 假设为true,才会执行
        Assumptions.assumeTrue(false,"结果不是true");
        System.out.println("后面的测试代码前提条件");
    }
    @DisplayName("简单断言1")
    @Test
    public void testAssertions1(){
        int add =10;
        Assertions.assertEquals(10,add,"add结果计算错误");
        System.out.println("后面的测试代码简单断言");
    }


}
