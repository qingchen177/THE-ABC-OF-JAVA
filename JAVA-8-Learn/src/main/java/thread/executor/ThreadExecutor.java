package main.java.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author qingchen
 * @date 29/8/2022 上午 11:33
 */

public class ThreadExecutor extends Thread{
    public static void main(String[] args) {
        ExecutorService e= Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            Thread t=new Thread(new ThreadExecutor());
            e.execute(t);
        }
        e.shutdown();
    }

    @Override
    public void run(){
        System.out.println("线程池~~~耶耶耶");

    }
}
