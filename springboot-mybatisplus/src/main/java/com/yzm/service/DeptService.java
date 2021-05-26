package com.yzm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yzm.pojo.Dept;

import java.util.List;

/**
 * @Auther: yzm
 * @Date: 2021/5/26 - 05 - 26 - 18:57
 * @Description: com.yzm.service
 * @version: 1.0
 */
public interface DeptService extends IService<Dept> {
    List<Dept> findAllDept();
}
