package main.java.thread.test;

import main.java.finalizeDemo.Dancer;
import main.java.thread.DancerRunnableThread;

/**
 * @author qingchen
 * @date 29/8/2022 上午 9:27
 */

public class TestDancerRunnableThread {
    public static void main(String[] args) {
        Dancer dancer1=new Dancer("路飞");
        Dancer dancer2=new Dancer("索隆");

        DancerRunnableThread dancerRunnableThread1=new DancerRunnableThread(dancer1);
        DancerRunnableThread dancerRunnableThread2=new DancerRunnableThread(dancer2);

//        new Thread(dancerRunnableThread1).start();
//        new Thread(dancerRunnableThread2).start();
        dancerRunnableThread1.run();
        dancerRunnableThread2.run();
    }
}
