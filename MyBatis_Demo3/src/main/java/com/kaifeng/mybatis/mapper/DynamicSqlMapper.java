package com.kaifeng.mybatis.mapper;

import com.kaifeng.mybatis.pojo.Emp;

import java.util.List;

public interface DynamicSqlMapper {

    List<Emp> getEmpByCondition(Emp emp);
}
