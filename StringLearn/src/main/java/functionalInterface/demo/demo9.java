package main.java.functionalInterface.demo;

import java.util.function.Predicate;

/**
 * @author qingchen
 * @date 10/8/2022 下午 5:34
 */

public class demo9 {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.test(s) && pre2.test(s);
        return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "abfsgsgs";
        boolean b = checkString(s,(String str)->{
            return str.length()>6;
        },(String str)->{
            return str.contains("a");
        });
        System.out.println(b);		//true
    }

}
