package com.chenlei.tian.entity;

import lombok.Data;

@Data
public class User {
    Long id;
    String name;
    Integer type;
    String password;
    String phone;
}
