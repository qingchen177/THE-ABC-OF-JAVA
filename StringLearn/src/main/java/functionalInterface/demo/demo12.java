package main.java.functionalInterface.demo;

import java.util.function.Function;

/**
 * @author qingchen
 * @date 10/8/2022 下午 5:39
 */

public class demo12 {
    public static void change(String s, Function<String,Integer> fun) {
        Integer in = fun.apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        String s = "1234";
        change(s,(String str)->{
            return Integer.parseInt(str);   //1234
        });

        change(s,str->Integer.parseInt(str));   //1234
    }
}
