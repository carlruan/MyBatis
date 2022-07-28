package com.kaifeng.mybatis.mapper;

import com.kaifeng.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    Dept getEmpAndDeptSepTwo(@Param("did") Integer did);

    Dept getDeptAndEmp(@Param("did") Integer did);

    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);

}
