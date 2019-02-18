package com.heima.regex;

import java.sql.SQLOutput;

/*
* A:������ʽ�ķ��鹦��
	* ���������ͨ�������Ҽ����俪��������š����磬�ڱ��ʽ ((A)(B(C))) �У������ĸ��������飺
*
		1     ((A)(B(C)))
		2     (A
		3     (B(C))
		4     (C)

		����ʼ�մ����������ʽ��
* B:������ʾ
	a:�и�
		�����밴�յ����и "sdqqfgkkkhjppppkl";
	b:�滻
		��������....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
		���ַ�����ԭ��:����Ҫѧ��̡���
 */
public class Demo1_7_Matches {
    public static void main(String[] args) {
        // demo1();
        // demo2();
        // demo3();
    }

    public static void demo3() {
    /*
    ��������....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
    ���ַ�����ԭ��:����Ҫѧ��̡���
     */
        String s = "����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
        String s2 = s.replaceAll("\\.","");
        String s3 = s2.replaceAll("(.)\\1+","$1");  //$1�����һ���е�����
        System.out.println(s3);
    }

    public static void demo2() {
        // �����밴�յ����и "sdqqfgkkkhjppppkl";
        String s = "sdqqfgkkkhjppppkl";
        String regex = "(.)\\1+";
        String[] arr = s.split(regex);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void demo1() {
        // ���� AABB��CCDD
        String regex = "(.)\\1(.)\\2";                  // \\1�����һ���ֳ���һ��	\\2����ڶ����ֳ���һ��
        System.out.println("�������".matches(regex));
        System.out.println("AABB".matches(regex));
        System.out.println("ABBB".matches(regex));
        System.out.println("CCDD".matches(regex));
        System.out.println("ABAB".matches(regex));

        System.out.println("--------");
        //���� ABAB��CDCD
        String regex2 = "(..)\\1";
        System.out.println("ABAB".matches(regex2));
        System.out.println("CDCD".matches(regex2));
        System.out.println("AABB".matches(regex2));
    }
}
