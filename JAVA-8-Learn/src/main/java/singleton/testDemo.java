package main.java.singleton;

/**
 * @author qingchen
 * @date 24/8/2022 下午 3:25
 */

public class testDemo {
    public static void main(String[] args) {
        HangryMan man1=HangryMan.getInstance();
        HangryMan man2=HangryMan.getInstance();

        man1.setName("我系第一个");
        man1.setAge(18);

        man2.setName("我系第2个");
        man2.setAge(188);

        System.out.println(man1.getName());
        System.out.println(man1.getAge());

        LazyMan man3=LazyMan.getInstance();
        LazyMan man4=LazyMan.getInstance();

        man3.setName("我系第3个");
        man3.setAge(18);

        man4.setName("我系第4个");
        man4.setAge(20);

        System.out.println(man3.getName());
        System.out.println(man3.getAge());

        HangryMan.out();
    }
}
