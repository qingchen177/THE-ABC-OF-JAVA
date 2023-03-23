package main.test;

import main.java.singleton.HangryMan;

/**
 * @author qingchen
 * @date 16/2/2023 下午 3:15
 */

public class DailyTest {
    public static void main(String[] args) {

        HangryMan hangryMan = new HangryMan();
        hangryMan.setName("Daily");
        setAge(hangryMan);

        System.out.println("hangryMan = " + hangryMan.getName()+"\n"+hangryMan.getAge()+"\n");
    }

    private static void setAge(HangryMan hangryMan) {
        hangryMan.setAge(10);
    }
}
