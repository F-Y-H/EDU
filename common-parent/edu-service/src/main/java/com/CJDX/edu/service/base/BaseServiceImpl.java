package com.CJDX.edu.service.base;


import com.CJDX.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements IBaseService<T>{

    //统一管理Dao
    @Autowired
    protected UserMapper userMapper;
}
