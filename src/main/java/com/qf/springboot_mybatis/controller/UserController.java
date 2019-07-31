package com.qf.springboot_mybatis.controller;

import com.qf.springboot_mybatis.entity.TUser;
import com.qf.springboot_mybatis.service.IUserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("query/{id}")
    public TUser add(@PathVariable("id") Long id){
        return userService.selectUser(id);
    }

}
