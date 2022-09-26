package com.hupofx.spring.dao.impl;

import com.hupofx.spring.dao.UserDao;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.spring.dao.impl
 * @date 2022/9/11 10:56
 */
public class UserDaoImpl implements UserDao {


    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
