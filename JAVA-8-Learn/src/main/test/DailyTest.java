package main.test;

import java.io.IOException;

import static main.java.util.MyUtil.getUUID;

/**
 * @author qingchen
 * @date 16/2/2023 下午 3:15
 */

public class DailyTest {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 25; i++) {
            System.out.println(getUUID());
        }
    }

}
