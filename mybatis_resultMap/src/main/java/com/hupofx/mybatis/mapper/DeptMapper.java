package com.hupofx.mybatis.mapper;

import com.hupofx.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.mybatis.mapper
 * @date 2022/8/29 13:54
 */
public interface DeptMapper {

    /**
     * 通过分步查询 查询员工以及所对应的部门信息 的第二步
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);


    /**
     * 查询部门以及部门中的员工信息
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     * 通过分步查询 查询部门以及部门中的员工信息的第一步
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
