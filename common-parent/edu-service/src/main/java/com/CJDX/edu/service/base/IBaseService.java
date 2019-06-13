package com.CJDX.edu.service.base;

public interface IBaseService<T> {

    public T findUserByID(Integer ID);
    public T findUserByUUID(String UUID);

    public void deleteUserByID(Integer ID);
    public void deleteUserByUUID(String UUID);

    public void updateUser(T t);

    public void insertUser(T t);

}
