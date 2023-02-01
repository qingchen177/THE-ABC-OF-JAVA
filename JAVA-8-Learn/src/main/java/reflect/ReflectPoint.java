package main.java.reflect;

/**
 * @author qingchen
 * @date 1/2/2023 下午 2:19
 */

public class ReflectPoint {

    public int x = 0;
    private int y = 0;

    public String str1 = "ball";
    public String str2 = "basketball";
    public String str3 = "itcat";

    public ReflectPoint(int x,int y) {//alt + shift +s相当于右键source
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "ReflectPointer [str1=" + str1 + ", str2=" + str2 + ", str3="
                + str3 + "]";
    }


}
