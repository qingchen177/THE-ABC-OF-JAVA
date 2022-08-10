package main.java.functionalInterface.demo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author qingchen
 * @date 10/8/2022 下午 5:18
 */

public class demo4 {
    public static Comparator<String> getComparator() {
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()-o1.length();
//            }
//        };

        //参数可以省略
//        return (String o1, String o2)->{
//            return o2.length()-o1.length();
//        };

        //简化
        return (o1, o2) -> o2.length() - o1.length();
    }

    public static void main(String[] args) {
        String[] arr = {"aaa", "b", "cccccc", "ddddddddd"};
        System.out.println("排序前：" + Arrays.toString(arr));
        Arrays.sort(arr, getComparator());
        System.out.println("排序后：" + Arrays.toString(arr));
    }
}

