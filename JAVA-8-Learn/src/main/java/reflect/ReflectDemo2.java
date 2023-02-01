package main.java.reflect;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * @author qingchen
 * @date 1/2/2023 下午 2:20
 */

public class ReflectDemo2 {

    //Filed类代表某一类中的一个成员变量
    @SneakyThrows
    public static void main(String[] args) {
        ReflectPoint rp1 = new ReflectPoint(3,4);
        Field fieldx = rp1.getClass().getField("x");//必须是x或者y
        System.out.println(fieldx.get(rp1));

        /*
         * private的成员变量必须使用getDeclaredField，并setAccessible(true),否则看得到拿不到
         */
        Field fieldy = rp1.getClass().getDeclaredField("y");
        fieldy.setAccessible(true);//暴力反射
        System.out.println(fieldy.get(rp1));

        System.out.println("--------------------------------");
        testField();
    }

    //将所有String类型的成员变量里的b改成a
    private static void testField() throws Exception {
        ReflectPoint rp1 = new ReflectPoint(3,4);
        changeBtoA(rp1);
        System.out.println(rp1);
    }

    private static void changeBtoA(Object obj) throws RuntimeException, Exception {
        Field[] fields = obj.getClass().getFields();

        for(Field field : fields) {
            //if(field.getType().equals(String.class))
            //由于字节码只有一份,用equals语义不准确
            if(field.getType()==String.class) {
                String oldValue = (String)field.get(obj);
                String newValue = oldValue.replace('b', 'a');
                field.set(obj,newValue);
            }
        }
    }



}
