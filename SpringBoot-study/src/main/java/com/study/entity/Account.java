package com.study.entity;

import lombok.Data;

@Data
public class Account {
    private long id;
    private String email;
    private String username;
    private String password;
}
