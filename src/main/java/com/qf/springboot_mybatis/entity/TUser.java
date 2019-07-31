package com.qf.springboot_mybatis.entity;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class TUser {
    private Long id;
    @NotNull
    private String username;


    @Pattern(regexp="" , message= "手机格式有误")
    @Email(message="")

    private String password;

}