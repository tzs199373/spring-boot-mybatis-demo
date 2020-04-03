package com.example.mybatis.service;

import com.example.mybatis.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
