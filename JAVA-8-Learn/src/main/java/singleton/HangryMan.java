package main.java.singleton;

/**
 * 饿汉单例模式
 *
 * @author qingchen
 * @date 24/8/2022 下午 2:59
 */

public class HangryMan {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private HangryMan(){}

    private static HangryMan hangryMan=new HangryMan();

    public static HangryMan getInstance(){
        return hangryMan;
    }

    public static void out(){
        System.out.println("类方法");
    }
}
