package main.java.util;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author qingchen
 * @date 20/10/2023 上午 10:59
 */

public class MyUtil {
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();

    }

    public static void main(String[] args) {
        String[] arrayOfWords = {"Goodbye", "World"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
        List<String> stringList = streamOfWords.collect(toList());
        stringList.forEach(System.out::println);

        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());


        IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a ->
                        IntStream.rangeClosed(a, 100)
                                .mapToObj(
                                        b -> new double[]{a, b, Math.sqrt(a * a + b * b)})
                               .filter(t -> t[2] % 1 == 0)).forEach(System.out::println);



    }
}
