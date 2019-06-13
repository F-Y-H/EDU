package com.CJDX.edu.service.impl;

import com.CJDX.edu.model.User;
import com.CJDX.edu.service.IUserService;
import com.CJDX.edu.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService{
    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User findUserByID(Integer ID) {
        return userMapper.findUserByID(ID);
    }

    @Override
    public User findUserByUUID(String UUID) {
        return null;
    }

    @Override
    public void deleteUserByID(Integer ID) {

    }

    @Override
    public void deleteUserByUUID(String UUID) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void insertUser(User user) {

    }
}
