package com.hupofx.spring.controller;

import com.hupofx.spring.service.UserService;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.spring.controller
 * @date 2022/9/11 10:52
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
