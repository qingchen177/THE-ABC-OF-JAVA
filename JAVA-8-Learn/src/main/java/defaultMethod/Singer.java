package main.java.defaultMethod;

/**
 * @author qingchen
 * @date 15/8/2022 上午 10:56
 */

public interface Singer {
    default void print(){
        System.out.println("我是一名歌手");
    }
}