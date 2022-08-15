package main.java.functionalInterface.demo;

import java.util.function.Supplier;

/**
 * @author qingchen
 * @date 10/8/2022 下午 5:23
 */

public class demo5 {
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        String s = getString(()->{
            return "周杰伦";
        });
        System.out.println(s);

        String s1 = getString(()->"完美主义");
        System.out.println(s1);
    }
}
