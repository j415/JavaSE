/*
    . �κ��ַ�
    \d ���֣�[0-9]
    \D �����֣� [^0-9]
    \s �հ��ַ���[ \t\n\x0B\f\r]
    \S �ǿհ��ַ���[^\s]
    \w �����ַ���[a-zA-Z_0-9]
    \W �ǵ����ַ���[^\w]
*/
package com.heima.regex;

public class Demo1_3_Regex {                // Ԥ�����ַ�
    public static void main(String[] args) {
        // demo1();
        // demo2();
        // demo3();
        // demo4();
        // demo5();
        // demo6();
        // demo7();

    }

    private static void demo7() {
        String regex = "\\W";
        System.out.println("a".matches(regex));
        System.out.println("9".matches(regex));
        System.out.println("_".matches(regex));
        System.out.println("$".matches(regex));
    }

    private static void demo6() {
        String regex = "\\w";
        System.out.println("a".matches(regex));
        System.out.println("9".matches(regex));
        System.out.println("_".matches(regex));
        System.out.println("$".matches(regex));
    }

    private static void demo5() {
        String regex = "\\S";
        System.out.println(" ".matches(regex));
        System.out.println("	".matches(regex)); 				//һ��tab��
        System.out.println("a".matches(regex));
    }

    private static void demo4() {
        String regex = "\\s";
        System.out.println(" ".matches(regex));
        System.out.println("	".matches(regex)); 				//һ��tab��
        System.out.println("\t".matches(regex));
    }

    private static void demo3() {
        String regex = "\\D";
        System.out.println("0".matches(regex));
        System.out.println("9".matches(regex));
        System.out.println("a".matches(regex));
    }

    private static void demo2() {
        String regex = "\\d";        // \����ת���ַ�����������\d����Ҫ\\d
        System.out.println("0".matches(regex));
        System.out.println("9".matches(regex));
        System.out.println("a".matches(regex));
    }

    private static void demo1() {
        String regex = "..";
        System.out.println("aa".matches(regex));
        System.out.println("a".matches(regex));
    }
}
