package main.java.thread.test;

import main.java.finalizeDemo.Dancer;
import main.java.thread.DancerCallableThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author qingchen
 * @date 29/8/2022 上午 10:37
 */

public class TestDancerCallableThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Dancer dancer1=new Dancer("路飞");
        Dancer dancer2=new Dancer("索隆");

        FutureTask task1=new FutureTask(new DancerCallableThread(dancer1));
        FutureTask task2=new FutureTask(new DancerCallableThread(dancer2));

        new Thread(task1).start();
        new Thread(task2).start();

        System.out.println(task1.get());//多线程执行完毕可以获取内容
        System.out.println(task2.get());//多线程执行完毕可以获取内容
    }
}
