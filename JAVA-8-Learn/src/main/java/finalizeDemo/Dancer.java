package main.java.finalizeDemo;

/**
 * @author qingchen
 * @date 24/8/2022 下午 5:06
 */

public class Dancer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dancer(String name) {
        this.name = name;
    }
    public Dancer() {
    }

    private String name;

    public String toString(){
        return name;
    }

    public void finalize(){
        System.out.println("这个英雄正在被回收");
    }

    public static void main(String[] args) {
        //只有一引用
        Dancer dancer;
        for (int i = 0; i < 1000000000; i++) {
            //不断生成新的对象
            //每创建一个对象，前一个对象，就没有引用指向了
            //那些对象，就满足垃圾回收的条件
            //当，垃圾堆积的比较多的时候，就会触发垃圾回收
            //一旦这个对象被回收，它的finalize()方法就会被调用
            dancer = new Dancer();
        }

    }
}
