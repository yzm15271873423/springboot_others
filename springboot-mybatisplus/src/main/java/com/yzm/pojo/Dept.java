package com.yzm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: yzm
 * @Date: 2021/5/26 - 05 - 26 - 18:50
 * @Description: com.yzm.pojo
 * @version: 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dept implements Serializable {
    private Integer deptno;
    private String dname;
    private String loc;
}
