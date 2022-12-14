package main.java;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author qingchen
 * @date 25/8/2022 上午 10:02
 */

public class Test {
    public static void main(String[] args) {

        //集合删除问题

        //直接删会报异常
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        for (String item : list) {
            if ("2".equals(item)) {
                list.remove(item);
            }
        }
        System.out.println(list);
        //使用迭代器删除才可以
//        list = new ArrayList<String>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        System.out.println(list + "before");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if (next.equals("2")) {
//                iterator.remove();
//
//            }
//        }
//
//        System.out.println(list + "after");
//

        String uuid= String.valueOf(System.currentTimeMillis());
        System.out.println(uuid);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSSS");
        String number = sdf.format(System.currentTimeMillis());//202211041552160219
        System.out.println("根据当前时间戳生成唯一："+number);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        String now = sdf.format(new Date());
//        System.out.println(now.substring(0,10)+"///");
    }
}
