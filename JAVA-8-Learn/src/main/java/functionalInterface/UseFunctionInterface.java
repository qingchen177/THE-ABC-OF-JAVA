package main.java.functionalInterface;

import main.java.functionalInterface.impl.MyFunctionInterfaceImpl;
import main.java.functionalInterface.myInterface.MyFunctionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author qingchen
 * @date 10/8/2022 下午 3:40
 */

public class UseFunctionInterface {

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {

            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }

    public static void show(MyFunctionInterface myInter) {
        myInter.saySomething("");
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Predicate<Integer> predicate = n -> true
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // n 如果存在则 test 方法返回 true

        System.out.println("输出所有数据:");

        // 传递参数 n
        eval(list, n->true);

        // Predicate<Integer> predicate1 = n -> n%2 == 0
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n%2 为 0 test 方法返回 true

        System.out.println("输出所有偶数:");
        eval(list, n-> n%2 == 0 );

        // Predicate<Integer> predicate2 = n -> n > 3
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n 大于 3 test 方法返回 true

        System.out.println("输出大于 3 的所有数字:");
        eval(list, n-> n > 3 );

        //========================分隔符======================================

        String message="assue maker";

        //调用show方法，方法的参数是一个接口，可以传递接口的实现类对象
        show(new MyFunctionInterfaceImpl());

        //调用show方法，方法的参数是一个接口，可以传递接口的匿名内部类
        show(new MyFunctionInterface() {
            @Override
            public void saySomething(String message) {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        //调用show方法，方法的参数是一个接口，可以使用Lambda表达式
        show((s)->{
            System.out.println("使用Lambda表达式重写接口中的抽象方法"+message);
        });

        //简化Lambda表达式
        show((s)-> System.out.println("使用简化的Lambda表达式重写接口中的抽象方法"+s));


    }
}
