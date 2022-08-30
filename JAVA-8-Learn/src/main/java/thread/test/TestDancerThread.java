package main.java.thread.test;

import main.java.finalizeDemo.Dancer;
import main.java.thread.DancerThread;

/**
 * @author qingchen
 * @date 29/8/2022 上午 9:18
 */

public class TestDancerThread {
    public static void main(String[] args) {
        Dancer dancer1=new Dancer("黄渤");
        Dancer dancer2=new Dancer("孙红雷");

        DancerThread dancerThread1=new DancerThread(dancer1);
        DancerThread dancerThread2=new DancerThread(dancer2);

        dancerThread1.run();
        dancerThread2.run();
    }
}
