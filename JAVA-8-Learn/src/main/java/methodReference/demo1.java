package main.java.methodReference;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author qingchen
 * @date 15/8/2022 上午 9:38
 */

public class demo1 {
    public static void main(String[] args) {
        //构造器引用：它的语法是Class::new，或者更一般的Class< T >::new
        final Car car = Car.create( Car::new );
        final List< Car > cars = Arrays.asList( car );

        //静态方法引用：它的语法是Class::static_method
        cars.forEach( Car::collide );

        //特定类的任意对象的方法引用：它的语法是Class::method
        cars.forEach( Car::repair );

        //特定对象的方法引用：它的语法是instance::method
        final Car police = Car.create( Car::new );
        cars.forEach( police::follow );

        //方法引用实例
        List<String> names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);

        //方法引用
        //情景一：实例对象：：方法
        PrintStream ps = System.out;
        Consumer<String> con1 = ps::println;
        con1.accept("qingchen");

        Consumer<String> con2 = (a)-> System.out.println(a);
        con2.accept("sparks fly");

        //情景二：类::静态方法
        Function<Double,Long> fun = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(fun.apply(12.3));
        //使用lambda简化
        Function<Double,Long> fun1 = (num) -> Math.round(num);
        System.out.println(fun1.apply(12.3));

        Function<Double,Long> fun2 = Math::round;
        System.out.println(fun2.apply(12.3));

        //情景三：类：：实例化方法
        Comparator<String> com = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com.compare("abc", "abc"));

        Comparator<String> com1 = String::compareTo;
        System.out.println(com1.compare("abc","abc"));
    }
}
