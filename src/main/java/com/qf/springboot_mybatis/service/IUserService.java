package com.qf.springboot_mybatis.service;

import com.qf.springboot_mybatis.entity.TUser;

public interface IUserService {
    TUser selectUser(Long id);
}
