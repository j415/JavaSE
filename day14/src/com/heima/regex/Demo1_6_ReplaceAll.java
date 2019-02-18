package com.heima.regex;
/*
 * A:正则表达式的替换功能
 * String类的功能：public String replaceAll(String regex,String replacement)
 */
public class Demo1_6_ReplaceAll {
    public static void main(String[] args) {
        String s = "a1s2p3i4r5i6n7g";
        String regex = "\\d";

        String s2 = s.replaceAll(regex, "");
        System.out.println(s2);

    }
}
