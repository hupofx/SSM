package com.hupofx.mybatis.mapper;

import com.hupofx.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.mybatis.mapper
 * @date 2022/8/26 10:10
 */
public interface SpecialSQLMapper {

    /**
     * 通过用户名模糊查询用户信息
     * @param mohu
     * @return
     */
    List<User> getUserByLike(@Param("mohu") String mohu);

    /**
     * 批量删除
     * @param ids
     */
    void deleteMoreUser(@Param("ids") String ids);

    /**
     * 动态设置表名，查询用户信息
     * @param tableName
     * @return
     */
    List<User> getUserList(@Param("tableName") String tableName);

    /**
     * 添加用户信息并获取自增的主键
     * @param user
     */
    void insertUser(User user);
}
