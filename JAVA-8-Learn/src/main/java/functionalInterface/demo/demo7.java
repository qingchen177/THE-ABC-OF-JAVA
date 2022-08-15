package main.java.functionalInterface.demo;

import java.util.function.Consumer;

/**
 * @author qingchen
 * @date 10/8/2022 下午 5:29
 */

public class demo7 {
    public static void method(String s, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(s);
//        con2.accept(s);

        //先执行con1 再执行 con2
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        method("Hello", (t) -> {
            //消费方式：把字符串转换为大写输出
            System.out.println(t.toUpperCase());    //HELLO
        }, (t) -> {
            //消费方式，把字符串转换为小写输出
            System.out.println(t.toLowerCase());    //hello
        });
    }
}
