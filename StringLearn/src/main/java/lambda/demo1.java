package main.java.lambda;

import java.util.Comparator;

/**
 * @author qingchen
 * @date 12/8/2022 下午 5:21
 */

public class demo1 {
    public static void main(String args[]) {
        int num = 10;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);  // 输出结果为 3

        String first = "";
        Comparator<String> comparator = (a, b) -> Integer.compare(a.length(), b.length());  //编译会出错
    }

    public interface Converter<T1, T2> {
        void convert(int i);
    }
}
