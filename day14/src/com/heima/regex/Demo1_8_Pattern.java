package com.heima.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Pattern p = Pattern.compile("a*b");
 * Matcher m = p.matcher("aaaaab");
 * boolean b = m.matches();
 */
public class Demo1_8_Pattern {
    public static void main(String[] args) {
        // demo1();
        // demo2();
    }

    public static void demo2() {
        String s = "我的手机号是17864309996，还有189123456789和13432661820";
        String regex = "1[3578]\\d{9}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        /*boolean b = m.find();
        System.out.println(b);
        System.out.println(m.group());*/
        while (m.find()){
            System.out.println(m.group());
        }
    }

    public static void demo1() {
        Pattern p = Pattern.compile("a*b");         // 获取到正则表达式
        Matcher m = p.matcher("aaaaab");      // 获取匹配器
        boolean b = m.matches();                    // 看是否能匹配，匹配就返回true
        System.out.println(b);

        System.out.println("aaaaab".matches("a*b"));    // 与上边结果一致
    }
}
