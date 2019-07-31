package com.qf.springboot_mybatis.controller;

import com.qf.springboot_mybatis.entity.TUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("thymeleaf")
public class ThtmeleafController {

    @RequestMapping("hello")
    public String hello(Model model){
        model.addAttribute("name","马云");
        model.addAttribute("money" , 2000);
        TUser user1 = new TUser();

        user1.setId(2L);
        user1.setUsername("小黄");
        user1.setPassword("456");
        TUser user2 = new TUser();
        user2.setId(3L);
        user2.setUsername("小庄");
        user2.setPassword("336");
        List<TUser> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        model.addAttribute("users" , users);
        return "index";
    }
}
