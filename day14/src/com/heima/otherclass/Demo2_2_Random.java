package com.heima.otherclass;

import java.util.Random;

/*
 * A:Random��ĸ���
 * �������ڲ���������������ͬ�����Ӵ������� Random ʵ����
 * ���ÿ��ʵ��������ͬ�ķ����������У����ǽ����ɲ�������ͬ���������С�
 * B:���췽��
 * public Random()
 * public Random(long seed)
 * C:��Ա����
 * public int nextInt()
 * public int nextInt(int n)(�ص�����)
 */
public class Demo2_2_Random {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt();
//        System.out.println(x);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(r.nextInt());
//            System.out.println(r.nextInt(100));
//        }

        Random r2 = new Random(1000);
        int a = r2.nextInt();
        int b = r2.nextInt();
        System.out.println(a);
        System.out.println(b);

    }
}
