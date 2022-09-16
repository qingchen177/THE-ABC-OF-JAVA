package main.java.thread;

import lombok.SneakyThrows;

/**
 * @author qingchen
 * @date 30/8/2022 下午 2:58
 */

public class demo2 {
    volatile static int k = 0;

    @SneakyThrows
    public static void main(String[] args) {

        Thread plus = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                k++;
            }
        }, "plus");

        Thread mina = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                k--;
            }
        }, "mina");

        plus.start();
        mina.start();

        plus.join();
        mina.join();

        Thread.sleep(2000);

        System.out.println(plus.isAlive());
        System.out.println(mina.isAlive());
        System.out.println(k);
    }
}
