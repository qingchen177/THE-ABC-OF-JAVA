package main.java.thread;

/**
 * @author qingchen
 * @date 30/8/2022 下午 2:13
 */
public class synchronization {
    static final Object lock = new Object();
    public static void main(String[] args) {

        new Thread(() -> {
            synchronized (lock) {
                System.out.println("开始执行");
                try {
                    // 同步代码内部才能调用
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("继续执行核心逻辑");
            }
        }, "t1").start();

        new Thread(() -> {
            synchronized (lock) {
                System.out.println("开始执行");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("继续执行核心逻辑");
            }
        }, "t2").start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("开始唤醒");

        synchronized (lock) {
            // 同步代码内部才能调用
            lock.notifyAll();
        }
    }
}
