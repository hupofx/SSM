package com.hupofx.spring.service.impl;

import com.hupofx.spring.dao.UserDao;
import com.hupofx.spring.service.UserService;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.spring.service.impl
 * @date 2022/9/11 10:54
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
