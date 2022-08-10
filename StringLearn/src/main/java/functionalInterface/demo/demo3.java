package main.java.functionalInterface.demo;

/**
 * @author qingchen
 * @date 10/8/2022 下午 5:16
 */

public class demo3 {
    public static void startThread(Runnable r) {
        new Thread(r).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->"+"线程启动了。");
            }
        });

        startThread(()-> System.out.println(Thread.currentThread().getName()+"-->"+"线程启动了。"));
    }
}
