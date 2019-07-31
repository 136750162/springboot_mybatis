package com.qf.springboot_mybatis.mapper;

import com.qf.springboot_mybatis.entity.TUser;
import org.springframework.stereotype.Component;

@Component
public interface TUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}