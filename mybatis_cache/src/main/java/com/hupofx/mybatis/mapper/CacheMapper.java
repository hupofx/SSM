package com.hupofx.mybatis.mapper;

import com.hupofx.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.mybatis.mapper
 * @date 2022/8/30 1:44
 */
public interface CacheMapper {

    /**
     * 根据员工id查询员工信息
     * @param empId
     * @return
     */
    Emp getEmpById(@Param("empId") Integer empId);

    /**
     * 添加员工信息
     * @param emp
     */
    void insertEmp(Emp emp);
}
