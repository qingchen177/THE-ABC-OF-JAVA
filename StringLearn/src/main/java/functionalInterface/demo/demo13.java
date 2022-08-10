package main.java.functionalInterface.demo;

import java.util.function.Function;

/**
 * @author qingchen
 * @date 10/8/2022 下午 5:41
 */

public class demo13 {
    public static void change(String s, Function<String,Integer> fun1, Function<Integer,String> fun2) {
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        String s = "123";
        change(s,(String str)->{
            return Integer.parseInt(s)+10;
        },(Integer i)->{
            return i+"";    //133
        });
        //优化
        change(s,str->Integer.parseInt(s)+10,i->i+"");  //133
    }
}
