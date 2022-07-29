package com.kaifeng.mybatis.mapper;

import com.kaifeng.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSqlMapper {

    List<Emp> getEmpByCondition(Emp emp);

    List<Emp> getEmpByChoose(Emp emp);
    int deletByArray(@Param("eids") Integer[] eids);
    int insertMoreByList(@Param("emps") List<Emp> emps);
}
