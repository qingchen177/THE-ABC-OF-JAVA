package main.java.lambda;

/**
 * @author qingchen
 * @date 12/8/2022 下午 5:34
 */

public class demo2 {
    //常规实现
    public static void main(String[] args) {
        MessageSend messageSend=new MessageSend();
        messageSend.sayMessage("常规方法实现");
    }
}
//定义接口
interface GreetingService {
    void sayMessage(String message);
}
//实现接口
class MessageSend implements GreetingService{

    @Override
    public void sayMessage(String message) {
        System.out.println(message);
    }
}