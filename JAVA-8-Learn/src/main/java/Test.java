package main.java;

import main.java.finalizeDemo.Dancer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author qingchen
 * @date 25/8/2022 上午 10:02
 */

public class Test {
    public static void main(String[] args) {
        List<Dancer> dancers = new ArrayList<>();

        for (int j = 0; j < 2000000; j++) {
            Dancer h = new Dancer(""+j);
            dancers.add(h);
        }

        Dancer dancer1=new Dancer();
        dancer1.setName("Hero 1000000");
        dancers.add(dancer1);
        // 进行10次查找，观察大体的平均值
        for (int i = 0; i < 10; i++) {
            // 打乱heros中元素的顺序
            Collections.shuffle(dancers);

            long start = System.currentTimeMillis();

            String target = "Hero 1000000";

            for (Dancer dancer : dancers) {
                if (dancer.name.equals(target)) {
                    System.out.println("找到了 hero!");
                    break;
                }
            }
            long end = System.currentTimeMillis();
            long elapsed = end - start;
            System.out.println("一共花了：" + elapsed + " 毫秒");
        }

    }
}
