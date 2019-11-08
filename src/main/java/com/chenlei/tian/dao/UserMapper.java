package com.chenlei.tian.dao;

import com.chenlei.tian.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectUserByPhone(String phone);
    int updateUser(@Param("user") User user);
    int insertUser(@Param("user") User user);
}
