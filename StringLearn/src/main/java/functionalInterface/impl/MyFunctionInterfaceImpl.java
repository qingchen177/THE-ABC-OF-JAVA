package main.java.functionalInterface.impl;

import main.java.functionalInterface.myInterface.MyFunctionInterface;

/**
 * @author qingchen
 * @date 10/8/2022 下午 4:22
 */

public class MyFunctionInterfaceImpl implements MyFunctionInterface {
    @Override
    public void saySomething(String message) {
        System.out.println("重写了抽象方法 "+message);
    }
}
