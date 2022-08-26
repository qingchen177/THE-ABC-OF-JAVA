package main.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author qingchen
 * @date 15/8/2022 下午 2:19
 */

public class demo {
    public static void main(String[] args) throws Exception{

        //流的五种生成方式
        //1.集合
        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6);
        //返回一个顺序流
        Stream<Integer> stream = lists.stream();
        //返回一个并行流
        Stream<Integer> stream2 = lists.parallelStream();

        //2.数组
        int[] intArr = {1, 2, 3, 4, 5, 6};
        IntStream intStream = Arrays.stream(intArr);

//        Arrays.sort(intArr);
//        Arrays.asList();
//        Arrays.binarySearch(intArr,2);
//        Arrays.copyOf(intArr,3);
//        Arrays.copyOfRange();
//        Arrays.deepEquals();
//        Arrays.deepHashCode();
//        Arrays.deepToString();
//        Arrays.equals(intArr,intArr);
//        Arrays.fill();
//        Arrays.parallelPrefix();

        //值
        Stream<Integer> valueStream = Stream.of(1,2,3,4,5,6,7);

        //文件
//        Stream<String> lines = Files.lines(Paths.get("data.txt"), Charset.defaultCharset());

        //函数
        //iterator
        Stream<Integer> iterator = Stream.iterate(0,n -> n+2).limit(6);
        //generator
        Stream<Double> generator = Stream.generate(Math::random).limit(5);

        //filter
        stream.filter(i -> i > 3).forEach(System.out::println);

        List<Integer> lists1 = Arrays.asList(1, 1, 3, 5, 5, 6);
        //distinct
        Stream<Integer> stream1 = lists1.stream().distinct();
        //limit  skip
        stream1.limit(2).skip(1).forEach(System.out::println);

        List<String> stringList = Arrays.asList("杰哥，不要啊", "忽略", "沈阳大街", "老八，秘制小汉堡");

        List<String> collect = stringList.stream()
                .map(s->s.split("，"))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        Optional<Integer> result = valueStream.filter(i -> i > 3).findFirst();

        System.out.println(result.orElse(-1));

        List<String> stringList1 = Arrays.asList("杰哥", "不要啊", "你干嘛", "我舅是太阳");

        String result1 = stringList1.stream()
                .map(String::toLowerCase)
                .collect(Collectors.joining("-"));
        System.out.println("result1 = " + result1);
    }
}
