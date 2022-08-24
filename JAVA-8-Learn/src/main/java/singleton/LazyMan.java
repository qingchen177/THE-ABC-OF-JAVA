package main.java.singleton;

/**
 * 懒汉单例模式
 *
 * @author qingchen
 * @date 24/8/2022 下午 2:59
 */

public class LazyMan {
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

    private LazyMan(){}

    private static LazyMan lazyMan;

    public static LazyMan getInstance(){
        if (lazyMan==null){
            lazyMan=new LazyMan();
        }
        return lazyMan;
    }
}
