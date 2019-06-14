package com.CJDX.edu.controller.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class BaseController<T> {

    public static String MANAGE_PAGE;
    public static String INFO_PAGE;
    public static String EDIT_PAGE;
    public static String UPDATE_PAGE;

    public static final String MANAGE = "manage";
    public static final String INFO = "info";
    public static final String EDIT = "edit";
    public static final String UPDATE = "update";

    public BaseController(){
        //1.获取泛型真实类型
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        System.out.println("========"+type);

        Class<?> modelclass = (Class<?>) type.getActualTypeArguments()[0];
        System.out.println("========"+modelclass);

        //2.获取模块名
        String modelName = modelclass.getSimpleName().toLowerCase();

        //3.给静态页面赋值
        MANAGE_PAGE = modelName+"/"+MANAGE;
        INFO_PAGE = modelName+"/"+INFO;
        EDIT_PAGE = modelName+"/"+EDIT;
        UPDATE_PAGE = modelName+"/"+UPDATE;

    }

}
