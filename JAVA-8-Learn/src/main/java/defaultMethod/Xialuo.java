package main.java.defaultMethod;

/**
 * @author qingchen
 * @date 15/8/2022 上午 10:57
 */

public interface Xialuo {
    default void print(){
        System.out.println("嗨害嗨，我是夏洛");
    }

    static void 经典语录(){
        System.out.println("还看星星一颗两颗连成线，你以为你是贪吃蛇啊！！！？");
    }
}
