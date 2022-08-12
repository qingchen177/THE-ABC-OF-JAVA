package main.java.lambda;

/**
 * @author qingchen
 * @date 12/8/2022 下午 5:45
 */

public class demo5 {
    //匿名内部类实现
    public static void main(String[] args) {
        //实现接口
        new GreetingService4(){
            @Override
            public void sayMessage(String message) {
                System.out.println(message);
            }
        }.sayMessage("匿名内部类实现");
    }
}
//定义接口
interface GreetingService4 {
    void sayMessage(String message);
}
