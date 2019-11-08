package com.chenlei.tian.service.impl;

import com.chenlei.tian.LoginUser;
import com.chenlei.tian.dao.UserMapper;
import com.chenlei.tian.entity.User;
import com.chenlei.tian.service.LoginService;
import com.chenlei.tian.util.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginImpl implements LoginService {
    @Resource
    UserMapper userMapper;
    @Override
    public boolean checkUser(LoginUser user) {
        if(StringUtil.isEmpty(user.getPhone()) || StringUtil.isEmpty(user.getPassword())) {
            return false;
        }
        User dataUser = userMapper.selectUserByPhone(user.getPhone());
        if(dataUser == null || StringUtil.isEmpty(dataUser.getPassword())) {
            return false;
        }else{
            return dataUser.getPassword().equals(user.getPassword());
        }
    }
}
