package main.java.functionalInterface.demo;

import java.util.function.Predicate;

/**
 * @author qingchen
 * @date 10/8/2022 下午 5:36
 */

public class demo11 {
    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.negate().test(s);
    }

    public static void main(String[] args) {
        String s = "abfsg";
        boolean b = checkString(s,(String str)->{
            return str.length()>10;
        });
        System.out.println(b);  // true
    }
}
