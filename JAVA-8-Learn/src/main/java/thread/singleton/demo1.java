package main.java.thread.singleton;

/**
 * @author qingchen
 * @date 16/9/2022 上午 9:52
 */

public class demo1 {
   private demo1(){
   }

   private volatile static demo1 instance;

   public static demo1 getInstance() {
      if (instance == null) {
         synchronized (demo1.class) {
            if (instance == null) {
               instance = new demo1();
               /*
               *  a. memory = allocate() 分配内存
               *  b. ctorInstanc(memory) 初始化对象
               *  c. instance = memory  设置instance指向刚分配的地址
               *
               * 上面的代码在编译运行时，可能会出现重排序从a-b-c排序为a-c-b。
               * 在多线程的情况下会出现以下问题。当线程A在执行第5行代码时，B线程进来执行到第2行代码。
               * 假设此时A执行的过程中发生了指令重排序，即先执行了a和c，没有执行b。
               * 那么由于A线程执行了c导致instance指向了一段地址，所以B线程判断instance不为null，
               * 会直接跳到第6行并返回一个未初始化的对象。
               */
            }
         }
      }
      return instance;
   }
}
