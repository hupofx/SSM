package com.hupofx.mybatis.mapper;

import com.hupofx.mybatis.pojo.User;

import java.util.List;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.mybatis.mapper
 * @date 2022/8/22 14:37
 */
public interface UserMapper {

    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 根据id查询用户信息
     * @return
     */
    User getUserById();

    /**
     * 查询所有的用户信息
     * @return
     */
    List<User> getAllUser();
}
