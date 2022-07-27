package com.kaifeng.mybatis.mapper;

import com.kaifeng.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    List<Emp> getAllEmp();

    Emp getEmpdept(@Param("eid") Integer eid);

}
