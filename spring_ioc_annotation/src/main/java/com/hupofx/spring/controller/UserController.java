package com.hupofx.spring.controller;

import com.hupofx.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.spring.controller
 * @date 2022/9/13 0:47
 */

//@Controller("controller")
@Controller
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    /*public UserController(UserService userService) {
        this.userService = userService;
    }*/

    /*public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    public void saveUser(){
        userService.saveUser();
    }

}
