package main.java.lambda;

/**
 * @author qingchen
 * @date 12/8/2022 下午 5:38
 */

public class demo3 {
    //实现接口
    static class MessageSend2 implements GreetingService{
        @Override
        public void sayMessage(String message) {
            System.out.println(message);
        }
    }

    //静态内部类实现
    public static void main(String[] args) {
        MessageSend2 messageSend=new MessageSend2();
        messageSend.sayMessage("静态内部类实现");
    }
}
//定义接口
interface GreetingService2 {
    void sayMessage(String message);
}

