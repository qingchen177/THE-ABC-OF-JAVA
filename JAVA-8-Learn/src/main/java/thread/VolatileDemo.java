package main.java.thread;

/**
 * @author qingchen
 * @date 1/9/2022 下午 2:44
 */

public class VolatileDemo {
    private static volatile boolean flag = false;

    public static void prepareData() {
        System.out.println("女朋友说");
        flag = true;
        System.out.println("停下来");
    }

    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("男朋友正在跑步");
                while (!flag) {

                }
                System.out.println("看到信息成功停下来了");
            }
        }).start();

        Thread.sleep(2000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                prepareData();
            }
        }).start();

    }
}
