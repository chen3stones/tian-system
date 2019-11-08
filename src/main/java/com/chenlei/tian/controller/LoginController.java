package com.chenlei.tian.controller;

import com.chenlei.tian.LoginUser;
import com.chenlei.tian.service.LoginService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/login")
@Api("登陆")
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Resource
    LoginService loginService;
    @PostMapping("/admin")
    public String adminLogin(@RequestBody LoginUser loginUser) {
        logger.info("{} want to login in",loginUser == null ? "" : loginUser.getPhone());
        if(loginService.checkUser(loginUser)) {
            return "redirct:/main.html";
        }else {
            return "false";
        }
    }
}
