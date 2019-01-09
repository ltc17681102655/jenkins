package com.ltc.Demo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
    private static void getInfo(Object obj) {
        Class<?> clazz = obj.getClass();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            Class<?>[] parameterTypes = method.getParameterTypes();
        }

        getField(clazz);


    }

    private static void getField(Class<?> clazz) {
        //-----------------------------我即将抽取的-------------------------//
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            String name = field.getName();
            Class c1 = field.getType();
            String type = c1.getName();
        }
        //------------------------------我即将抽取的------------------------//
    }


}
