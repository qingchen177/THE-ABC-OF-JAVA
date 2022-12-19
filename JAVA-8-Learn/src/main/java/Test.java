package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingchen
 * @date 25/8/2022 上午 10:02
 */

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        for (String item : list) {
            if ("1".equals(item)) {
                list.remove(item);
            }
        }
        System.out.println(list);

        list = new ArrayList<String>();
        list.add("1");
    }
}
