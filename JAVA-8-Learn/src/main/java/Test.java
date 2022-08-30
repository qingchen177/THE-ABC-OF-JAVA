package main.java;

/**
 * @author qingchen
 * @date 25/8/2022 上午 10:02
 */

public class Test {
    public static void main(String[] args) {
        String str1="";
        String str2="";

        int num=97;

        str1+=num;
        System.out.println(str1);

        str2+=(char) num;
        System.out.println(str2);
    }
}
