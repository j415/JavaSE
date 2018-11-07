/*
   A:Greedy ������
     * X? X��һ�λ�һ��Ҳû��
     * X* X����λ���
     * X+ X��һ�λ���
     * X{n} X��ǡ�� n ��
     * X{n,} X������ n ��
     * X{n,m} X������ n �Σ����ǲ����� m ��
 */
package com.heima.regex;

public class Demo1_4_Regex {                // ������
    public static void main(String[] args) {
        // demo1();
        // demo2();
        // demo3();
        // demo4();
        // demo5();
        // demo6();

    }

    public static void demo6() {
        String regex = "[abc]{4,13}";
        System.out.println("aaab".matches(regex));                  // 4
        System.out.println("ab".matches(regex));                    // 2
        System.out.println("aaaaabbbbbccccc".matches(regex));       // 15
        System.out.println("aaaacbbac".matches(regex));             // 9
    }

    public static void demo5() {
        String regex = "[abc]{4,}";
        System.out.println("aaab".matches(regex));
        System.out.println("aaaacbbac".matches(regex));
        System.out.println("ahac".matches(regex));
    }

    public static void demo4() {
        String regex = "[abc]{4}";
        System.out.println("aaab".matches(regex));
        System.out.println("aaaacbbac".matches(regex));
        System.out.println("ahac".matches(regex));
    }

    public static void demo3() {
        String regex = "[abc]+";
        System.out.println("".matches(regex));
        System.out.println("aaabbc".matches(regex));
        System.out.println("a".matches(regex));
    }

    public static void demo2() {
        String regex = "[abc]*";
        System.out.println("".matches(regex));
        System.out.println("aaa".matches(regex));
        System.out.println("a".matches(regex));
    }

    public static void demo1() {
        String regex = "[abc]?";
        System.out.println("a".matches(regex));
        System.out.println("b".matches(regex));
        System.out.println("c".matches(regex));
        System.out.println("d".matches(regex));
        System.out.println("".matches(regex));
    }
}
