package main.java.thread;

import main.java.finalizeDemo.Dancer;

import java.util.concurrent.Callable;

/**
 * @author qingchen
 * @date 29/8/2022 上午 10:34
 */

public class DancerCallableThread implements Callable<String> {
    private Dancer dancer;

    public DancerCallableThread(Dancer dancer){
        this.dancer=dancer;
    }

    @Override
    public String call()  {
        return "call方法"+dancer.getName();
    }
}
