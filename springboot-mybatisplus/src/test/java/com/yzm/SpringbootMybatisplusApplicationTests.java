package com.yzm;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yzm.pojo.Dept;
import com.yzm.service.DeptService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisplusApplicationTests {

    @Autowired
    private DeptService deptService;

    @Test
    public void findDept() {
        List<Dept> list = deptService.findAllDept();
        for (Dept dept : list) {
            System.out.println(dept);
        }
    }

    @Test
    public void testQueryWrapper() {
        QueryWrapper<Dept> wrapper = new QueryWrapper<>();
        wrapper.ge("deptno",30).eq("dname","java").likeRight("dname","j");
        List<Dept> list = deptService.list(wrapper);
        for (Dept dept : list) {
            System.out.println(dept);
        }

    }

    @Test
    public void testQueryWrapper2() {
        QueryWrapper<Dept> wrapper = new QueryWrapper<>();
        wrapper.eq("deptno",20);
        Dept dept = deptService.getOne(wrapper);
        System.out.println(dept);
    }

    @Test
    public void testAdd() {

        boolean save = deptService.save(new Dept(null, "晓明", "beijing"));
        System.out.println(save);
    }

    @Test
    public void testUpdate() {
        Dept dept = new Dept();
        dept.setDname("xxx");
        dept.setLoc("yyy");
        QueryWrapper<Dept> wrapper = new QueryWrapper<>();
        wrapper.eq("deptno",66);
        boolean b = deptService.update(dept, wrapper);
        System.out.println(b);
    }

    @Test
    public void testDelete() {

        QueryWrapper<Dept> wrapper = new QueryWrapper<>();
        wrapper.eq("deptno",66);
        boolean b = deptService.remove( wrapper);
        System.out.println(b);
    }

    @Test
    public void testPage(){
        // 当前页  页大小
        QueryWrapper wrapper = new QueryWrapper();
        //queryWrapper.likeRight("dname", "A");
        Page page = deptService.page(new Page(1, 2), wrapper);
        // 当前页数据  总页数  总记录数  当前页  页大小 ... ..
        List<Dept> list = page.getRecords();
        list.forEach(System.out::println);
        System.out.println("总页数:"+page.getPages());
        System.out.println("总记录数:"+page.getTotal());
        System.out.println("当前页:"+page.getCurrent());
        System.out.println("页大小:"+page.getSize());
    }

}
