package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author qingchen
 * @date 9/8/2022 下午 2:57
 */

public final class FunctionLenrn {
    private String s;

    public FunctionLenrn() {
    }

    public FunctionLenrn(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        new FunctionLenrn().go();
    }

    public void go() {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");

        List<Integer> list2 = list.stream().map(FunctionLenrn::string2Integer).collect(Collectors.toList());
        list2.forEach(System.out::println);

        List<Integer> list3 = list.stream().map(new FunctionLenrn()::string2Integer2).collect(Collectors.toList());
        list3.forEach(System.out::println);

        List<FunctionLenrn> listTest = new ArrayList<>();
        listTest.add(new FunctionLenrn("111"));
        listTest.add(new FunctionLenrn("222"));
        listTest.add(new FunctionLenrn("333"));

        List<Integer> list4 = listTest.stream().map(FunctionLenrn::getS).collect(Collectors.toList());
        list4.forEach(System.out::println);
    }

    public static Integer string2Integer(String str) {
        return Integer.valueOf(str);
    }

    public Integer string2Integer2(String str) {
        return Integer.valueOf(str);
    }

    public Integer getS() {
        return Integer.valueOf(s);
    }


}
