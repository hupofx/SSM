package com.hupofx.spring.service.impl;

import com.hupofx.spring.dao.UserDao;
import com.hupofx.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.spring.service.impl
 * @date 2022/9/13 0:48
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
