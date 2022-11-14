package main.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qingchen
 * @date 25/8/2022 上午 10:02
 */

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("a",map.get("a")+2);

        System.out.println(map.get("a"));
    }
}
