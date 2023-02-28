package main.java.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author qingchen
 * @date 28/2/2023 上午 10:14
 */

public class ReflectDemo3 {
    public static void main(String[] args) {
        People p = new People();
        Method[] methods = p.getClass().getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + " " + method.toString());
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------"+"\n");

        Method[] declaredMethods = p.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName() + " " + declaredMethod.toString());

        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------"+"\n");

        Field[] fields = p.getClass().getFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.toString());
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------"+"\n");

        Field[] declaredFields = p.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName()+ " " +declaredField.toString());
        }
    }
}
