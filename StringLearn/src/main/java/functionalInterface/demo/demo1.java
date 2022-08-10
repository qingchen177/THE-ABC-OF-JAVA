package main.java.functionalInterface.demo;

/**
 * @author qingchen
 * @date 10/8/2022 下午 4:56
 */

public class demo1 {
    public static void showMessage(int level, String message) {
        //对用户类型判断，不同类型发送不同消息
        if(level == 1) {
            System.out.println("hello "+message);
        }else {
            System.out.println("hello admin");
        }
    }

    public static void main(String[] args) {
        //定义用户信息
        String name =  "周杰伦";
        String position =  "good!!!!!!!!";
        showMessage(1,name+position);
    }
}
