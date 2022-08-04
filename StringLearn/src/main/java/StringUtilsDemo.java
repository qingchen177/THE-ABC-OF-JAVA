package main.java;

import org.apache.commons.lang3.StringUtils;

/**
 * @author qingchen
 * @date 4/8/2022 上午 10:54
 */

public class StringUtilsDemo {
    public static void main(String[] args) {

        //isEmpty
        StringUtils.isEmpty(null);//true
        StringUtils.isEmpty("");//true
        StringUtils.isEmpty(" ");//false
        StringUtils.isEmpty("\t");//false
        StringUtils.isEmpty("\r");//false
        StringUtils.isEmpty("\n");//false

        //isBlank
        StringUtils.isBlank(null);//true
        StringUtils.isBlank("");//true
        StringUtils.isBlank(" ");//true
        StringUtils.isBlank("\t");//true
        StringUtils.isBlank("\r");//true
        StringUtils.isBlank("\n");//true

        //isWhitespace
        StringUtils.isWhitespace(null);//false
        StringUtils.isWhitespace("");//true
        StringUtils.isWhitespace(" ");//true
        StringUtils.isWhitespace("\t");//true
        StringUtils.isWhitespace("\r");//true
        StringUtils.isWhitespace("\n");//true

        //substring
        StringUtils.substring("qingchen", 3);//gchen
        StringUtils.substring("qingchen", -2);//en
        StringUtils.substring("qingchen", 3, 6);//gch
        StringUtils.substring("qingchen", -2, 4);//
        StringUtils.substring("qingchen", -2, -4);//ch
        StringUtils.substring("qingchen", -4, -2);//

        //substringAfter
        StringUtils.substringAfter("qingchen", 63);
        StringUtils.substringAfter("qingchen", "g");
        StringUtils.substringAfter("qingchen", "a");
        StringUtils.substringAfter("qingchen", null);
        StringUtils.substringAfter("qingchen", "");
        StringUtils.substringAfter("qingchen", " ");

        String s0 =StringUtils.substringAfter("qingchen", 3);
        String s1 = StringUtils.substringAfter("qingchen", "g");
        String s2 =StringUtils.substringAfter("qingchen", "a");
        String s3 = StringUtils.substringAfter("qingchen", null);
        String s4 = StringUtils.substringAfter("qingchen", "");
        String s5 = StringUtils.substringAfter("qingchen", " ");

        System.out.println(s0+" 1"+s1+" 2"+s2+" 3"+s3+" 4"+s4+" 5"+s5);
    }
}
