package com.yzm;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yzm.pojo.Dept;
import com.yzm.service.DeptService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Stream;

@SpringBootTest
@DisplayName("参数化测试")
class SpringbootMybatisplusApplicationTests6 {


    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void testWithValueSource(int argument) {
        System.out.println(argument);
        Assertions.assertTrue(argument > 0 && argument < 4);
    }
    @ParameterizedTest
    @MethodSource("stringProvider")
    void testWithExplicitLocalMethodSource(String argument) {
        Assertions.assertNotNull(argument);
    }
    static Stream<String> stringProvider() {
        return Stream.of("apple", "banana");
    }

}
