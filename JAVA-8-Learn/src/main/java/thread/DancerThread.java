package main.java.thread;

import main.java.finalizeDemo.Dancer;

/**
 * @author qingchen
 * @date 29/8/2022 上午 9:13
 */

public class DancerThread extends Thread {
    private Dancer dancer;

    public DancerThread(Dancer dancer){
        this.dancer=dancer;
    }

    public void run(){
        System.out.println(dancer.getName()+"正在跳舞~~~~~~~~~~~~");
    }
}
