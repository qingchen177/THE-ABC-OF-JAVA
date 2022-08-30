package main.java.thread.executor;

import java.util.concurrent.*;

/**
 * @author qingchen
 * @date 29/8/2022 下午 2:26
 */

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) throws Exception {
        //创建线程池
        ExecutorService pool = new ThreadPoolExecutor(3, 10, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(512),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        //创建任务
        Callable myCallable = () -> {
            System.out.println("method: "+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("call方法执行了");
            return "call方法返回值";
        };
        Future future = pool.submit(myCallable);
        while (true){
            if(future.isDone()){
                System.out.println(future.get());
                break;
            }
            System.out.println(" 1:  "+Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("线程池内的线程还没执行完方法，等一下好吧，表急");
        }
        pool.shutdown();
    }
}
