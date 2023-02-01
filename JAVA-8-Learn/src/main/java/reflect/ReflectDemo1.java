package main.java.reflect;

import lombok.SneakyThrows;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author qingchen
 * @date 1/2/2023 下午 1:22
 */

public class ReflectDemo1 {
    public static void main(String[] args) throws NoSuchMethodException {
        reflectTestTwo();
    }


    @SneakyThrows
    private void printClassMethod() {
        Date date = new Date();
        //下面的这三种方式都可以得到字节码
//        Class c1 = Date.class();
        date.getClass();
        //若存在则加载，否则新建,往往使用第三种,类的名字在写源程序时不需要知道，到运行时再传递过来
        Class.forName("java.lang.String");
        try {
            Class c = Class.forName("java.util.Stack");

            Method[] m = c.getDeclaredMethods();

            for (int i = 0; i < m.length; i++) {
                System.out.println(m[i].toString());

            }

        } catch (Throwable e) {
            System.err.println(e);
        }
    }

    private void printClassName(Object obj) {
        System.out.println("The class of " + obj +
                " is " + obj.getClass().getName());
    }

    private void reflectTestOne() {
        String str = "abc";
        Class cls1 = str.getClass();
        Class cls2 = String.class;
        Class cls3 = null;//必须要加上null
        try {
            cls3 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);

        //判定指定的 Class 对象是否表示一个基本类型。
        System.out.println(cls1.isPrimitive());
        System.out.println(int.class.isPrimitive());
        System.out.println(int.class == Integer.class);
        System.out.println(int.class == Integer.TYPE);
        System.out.println(int[].class.isPrimitive());
        System.out.println(int[].class.isArray());
    }

    private static void reflectTestTwo() throws SecurityException, NoSuchMethodException {
        System.out.println(String.class.getConstructor(StringBuffer.class));
    }


}
