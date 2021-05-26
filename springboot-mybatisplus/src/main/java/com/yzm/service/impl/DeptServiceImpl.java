package com.yzm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yzm.mapper.DeptMapper;
import com.yzm.pojo.Dept;
import com.yzm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: yzm
 * @Date: 2021/5/26 - 05 - 26 - 18:58
 * @Description: com.yzm.service.impl
 * @version: 1.0
 */

@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper,Dept> implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> findAllDept() {
        return deptMapper.findAllDept();
    }
}
