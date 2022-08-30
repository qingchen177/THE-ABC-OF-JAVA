package main.java.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author qingchen
 * @date 30/8/2022 下午 2:30
 */

public class printABC {
    public static void main(String[] args) {
        AwaitSignal awaitSignal = new AwaitSignal(5);
        // 构建三个条件变量
        Condition a = awaitSignal.newCondition();
        Condition b = awaitSignal.newCondition();
        Condition c = awaitSignal.newCondition();
        // 开启三个线程
        new Thread(() -> {
            awaitSignal.print("a", a, b);
        }).start();

        new Thread(() -> {
            awaitSignal.print("b", b, c);
        }).start();

        new Thread(() -> {
            awaitSignal.print("c", c, a);
        }).start();

        System.out.println("线程启动！");

        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        awaitSignal.lock();
        try {
            // 先唤醒a
            a.signal();
        } finally {
            awaitSignal.unlock();
        }
    }


}

class AwaitSignal extends ReentrantLock {

    // 循环次数
    private int loopNumber;

    public AwaitSignal(int loopNumber) {
        this.loopNumber = loopNumber;
    }

    /**
     * @param print   输出的字符
     * @param current 当前条件变量
     * @param next    下一个条件变量
     */
    public void print(String print, Condition current, Condition next) {

        for (int i = 0; i < loopNumber; i++) {
            lock();
            try {
                try {
                    // 获取锁之后等待
                    current.await();
                    System.out.print(print);
                } catch (InterruptedException e) {
                }
                next.signal();
            } finally {
                unlock();
            }
        }
    }

}
