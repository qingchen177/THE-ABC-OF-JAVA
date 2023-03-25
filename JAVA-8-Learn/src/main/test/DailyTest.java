package main.test;

/**
 * @author qingchen
 * @date 16/2/2023 下午 3:15
 */

public class DailyTest {
    public static void main(String[] args) {
        System.out.println("args = " + division());
    }

    public static int division() {

        int result = 0;

        try {
            result = 5 / 0;
        } catch (Exception e){
            e.printStackTrace();
            return result;
        }
        return result;
    }
}
