package com.yzm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yzm.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: yzm
 * @Date: 2021/5/26 - 05 - 26 - 18:51
 * @Description: com.yzm.mapper
 * @version: 1.0
 */

@Mapper
public interface DeptMapper extends BaseMapper<Dept> {

    List<Dept> findAllDept();
}
