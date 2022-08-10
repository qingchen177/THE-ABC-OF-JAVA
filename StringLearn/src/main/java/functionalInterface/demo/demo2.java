package main.java.functionalInterface.demo;

import main.java.functionalInterface.myInterface.MessageBuilder;

/**
 * @author qingchen
 * @date 10/8/2022 下午 5:02
 */

public class demo2 {
    public static void showMessage(int level, MessageBuilder mb) {
        //对用户类型判断，不同类型发送不同消息
        if(level == 1) {
            System.out.println("hello "+mb.buildMessage());
        }else {
            System.out.println("hello admin");
        }
    }

    public static void main(String[] args) {
        //定义用户信息
        String name =  "周杰伦";
        String position =  "good!!!!!!!!";
        showMessage(2,()->{
            System.out.println("Lambda执行！");
            return name+position;
        });
    }
}
