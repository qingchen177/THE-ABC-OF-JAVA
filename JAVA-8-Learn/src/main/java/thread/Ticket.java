package main.java.thread;

/**
 * @author qingchen
 * @date 29/8/2022 下午 6:53
 */

public class Ticket {
    public static void main(String[] args) {
        // 创建Runnable子类对象
        SellWindow2 sellWindow2 = new SellWindow2();
        // 创建3个线程对象
        Thread t1 = new Thread(sellWindow2);
        Thread t2 = new Thread(sellWindow2);
        Thread t3 = new Thread(sellWindow2);
        // 起名
        t1.setName("A窗口");
        t2.setName("B窗口");
        t3.setName("C窗口");

        // start
        t1.start();
        t2.start();
        t3.start();
    }
}

// 方式二
class SellWindow2 implements Runnable{
    // 定义成员变量tickets
    int tickets = 100;
    // run

    @Override
    public void run() {
        // 卖票
        while (true) {
            // 判断
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "卖了第" + (tickets--) +
                        "票");
            }
        }
    }
}
