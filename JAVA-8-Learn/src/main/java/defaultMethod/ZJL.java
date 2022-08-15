package main.java.defaultMethod;

/**
 * @author qingchen
 * @date 15/8/2022 上午 10:47
 */

public class ZJL implements Singer,Xialuo{

    @Override
    public void print() {
        Singer.super.print();
        Xialuo.super.print();
        Xialuo.经典语录();
        System.out.println("我是周杰伦，我感觉我一直活在夏洛的影子里");

    }
}

