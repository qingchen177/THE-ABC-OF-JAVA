package main.test;

import main.java.annotation.Calculator;
import main.java.annotation.Check;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author qingchen
 * @date 10/10/2023 下午 6:57
 */

public class AnnotationTest {
    public static void main(String[] args) throws IOException {
        Calculator c = new Calculator();
        //获取该类的字节码文件对象
        Class<? extends Calculator> cls = c.getClass();
        //获取所有方法
        Method[] methods = cls.getMethods();

        int num = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for(Method method : methods){
            //判断方法上是否有Check注解
            if(method.isAnnotationPresent(Check.class)){
                //有Check注解，执行
                try{
                    method.invoke(c);
                } catch (Exception e) {
                    //捕获异常，记录到文件中

                    num++;
                    bw.write(method.getName() + "方法出现异常");
                    bw.newLine();
                    bw.write("异常的名称：" + e.getCause());
                    bw.newLine();
                    bw.write("异常的原因：" + e.getMessage());
                    bw.newLine();
                    bw.write("----------------");
                    bw.newLine();
                }
            }
        }

        bw.write("本次测试一共出现" + num + "次异常");

        bw.flush();
        bw.close();

    }
}
