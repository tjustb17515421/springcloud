package com.mou.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)//链式写法 --> 就是方法返回继续调用方法 --> dept.setDeptno(11).setDname("sss").xxxx
public class Dept implements Serializable {
    public Integer deptno;
    public String dname;
    public String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
