package main.java.thread;

import main.java.finalizeDemo.Dancer;

/**
 * @author qingchen
 * @date 29/8/2022 上午 9:23
 */

public class DancerRunnableThread implements Runnable{
    private Dancer dancer;

    public DancerRunnableThread(Dancer dancer){
        this.dancer=dancer;

    }

    @Override
    public void run() {
        System.out.println(dancer.getName()+"实现runnable接口来跳舞！！！");
    }
}
