package main.java.lambda;

/**
 * @author qingchen
 * @date 12/8/2022 下午 4:40
 */
public class LambdaDemo {

    final static String salutation = "Hello! ";

    public static void main(String[] args) {
        LambdaDemo demo = new LambdaDemo();

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + demo.operate(10, 5, addition));
        System.out.println("10 - 5 = " + demo.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + demo.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + demo.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        GreetingService greetService3 = message ->
                System.out.println(salutation + message);


        greetService1.sayMessage("周杰伦");
        greetService2.sayMessage("2004 语无伦次 yyds");
        greetService3.sayMessage("暗号");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}

