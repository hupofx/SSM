package com.hupofx.mybatis.mapper;

import com.hupofx.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.mybatis.mapper
 * @date 2022/8/26 15:30
 */
public interface EmpMapper {

    /**
     * 根据id查询员工信息
     * @param empId
     * @return
     */
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    /**
     * 获取员工以及对应的部门信息
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    /**
     * 通过分步查询 查询员工以及所对应的部门信息 的第一步
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    /**
     * 通过分步查询 查询部门以及部门中的员工信息的第二步
     * @param deptID
     * @return
     */
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptID") Integer deptID);
}
