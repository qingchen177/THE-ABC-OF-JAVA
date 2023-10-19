package main.java.annotation;

/**
 * @author qingchen
 * @date 10/10/2023 下午 6:57
 */

public class Calculator {
    //加法
    @Check
    public void add() {
        System.out.println("1 + 0 =" + (1 + 0));
    }

    //减法
    @Check
    public void sub() {
        System.out.println("1- 0 = " + (1 - 0));
    }

    //除法
    @Check
    public void div() {
        System.out.println("1 / 0 = " + (1 / 0));
    }
}
