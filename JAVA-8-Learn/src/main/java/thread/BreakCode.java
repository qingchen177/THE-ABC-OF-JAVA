package main.java.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingchen
 * @date 26/8/2022 上午 9:32
 */

public class BreakCode {
    static List<String> list=new ArrayList<>();
    static String psw=BreakCode.createCode(3);
    public static void main(String[] args) {

        System.out.println("随机密码："+psw);
        Thread startBreakCode =new Thread(){
            @Override
            public void run() {
                breakCode(3);
            }
        };
        Thread log = new Thread(() -> getLog());
        startBreakCode.start();
        log.setDaemon(true);
        log.start();
    }

    public static void breakCode(int len){
        while (true) {
            String a=BreakCode.createCode(len);
            list.add(a);
            if(a.equals(psw)){
                System.out.println("破解成功："+a);
                break;
            }
        }
    }

    public static void getLog(){
        while(true){
            if(list.isEmpty()){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                for(int i=0;i<list.size();i++) {
                    System.out.println(list.get(i));
                }
            }
        }
    }

    /**
    * 生成密码
    */
    public static String createCode(int length){
        String pool="";
        for(short i=0;i<=9;i++){
            pool+=(char)i;
        }
        for(short i='a';i<='z';i++){
            pool+=(char)i;
        }
        for(short i='A';i<='Z';i++){
            pool+=(char)i;
        }
        char [] cs=new char[length];
        for(int i=0;i<cs.length;i++){
            int index= (int) (Math.random()*pool.length());
            cs[i]=pool.charAt(index);
        }
        String result =new String(cs);
        return result;
    }
}
