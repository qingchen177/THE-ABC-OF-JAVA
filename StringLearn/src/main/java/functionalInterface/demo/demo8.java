package main.java.functionalInterface.demo;

import java.util.function.Predicate;

/**
 * @author qingchen
 * @date 10/8/2022 下午 5:31
 */

public class demo8 {
    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s = "ABCDE";
        boolean b = checkString(s, (String str) -> {
            //对参数传递的字符串进行自定义判断
            return s.length() > 5;
        });
        System.out.println(b);	//false

        //优化Lambda
        boolean b1 = checkString(s,str->s.length() > 4);
        System.out.println(b1);		//true
    }
}
