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
        String s = "�ҵ��ֻ�����17864309996������189123456789��13432661820";
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
        Pattern p = Pattern.compile("a*b");         // ��ȡ��������ʽ
        Matcher m = p.matcher("aaaaab");      // ��ȡƥ����
        boolean b = m.matches();                    // ���Ƿ���ƥ�䣬ƥ��ͷ���true
        System.out.println(b);

        System.out.println("aaaaab".matches("a*b"));    // ���ϱ߽��һ��
    }
}
