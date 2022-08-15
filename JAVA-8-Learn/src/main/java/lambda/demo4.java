package main.java.lambda;

/**
 * @author qingchen
 * @date 12/8/2022 下午 5:43
 */

public class demo4 {
    //局部内部类实现
    public static void main(String[] args) {
        //实现接口
        class MessageSend2 implements GreetingService{
            @Override
            public void sayMessage(String message) {
                System.out.println(message);
            }
        }
        demo3.MessageSend2 messageSend=new demo3.MessageSend2();
        messageSend.sayMessage("局部内部类实现");
    }
}
//定义接口
interface GreetingService3 {
    void sayMessage(String message);
}
