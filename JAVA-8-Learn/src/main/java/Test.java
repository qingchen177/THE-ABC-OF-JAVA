package main.java;

import java.util.Arrays;
import java.util.List;

/**
 * @author qingchen
 * @date 25/8/2022 上午 10:02
 */

public class Test {
    public static void main(String[] args) {
        String str1="0,1,2,3";

        List<String> noticeTypes = Arrays.asList(str1.split(","));

        System.out.println("noticeTypes.contains(DemoEnum.SMS.getCode()) = " + noticeTypes.contains(DemoEnum.SMS.getCode().toString()));
    }
}
