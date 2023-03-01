package main.java.reflect;

import main.java.StringUtils.CamelCaseUtils;

import java.lang.reflect.Field;

/**
 * @author qingchen
 * @date 28/2/2023 上午 10:14
 */

public class ReflectDemo4 {
    public static void main(String[] args) throws IllegalAccessException {
        Class<People> peopleClass = People.class;
        Field[] declaredFields = peopleClass.getDeclaredFields();
        System.out.println("declaredFields = " + declaredFields);

        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object o = declaredField.get(new People());
//            System.out.println(o.toString());
        }

        String s = CamelCaseUtils.toUnderlineName("aBdC");
        System.out.println("s = " + s);
    }
}