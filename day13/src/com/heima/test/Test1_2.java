/*
   A:������ʾ
 *
     ���󣺰��ַ�����ת
         ����������¼��"abc"
         ��������"cba"

     ��StringBuffer�Ĺ���ʵ��
 */
package com.heima.test;

import java.util.Scanner;

public class Test1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("�������ַ���:");
        String line = sc.nextLine();
        String s = revString(line);
        System.out.println(s);


    }
    /*
     * ���ַ�����ת
     * 1,����ֵ����String
     * 2,�����б�String line
     */
    private static String revString(String line){
        StringBuffer sb = new StringBuffer(line);       // ���ַ���ת����StringBuffer����
        sb.reverse();                                   // ��ת������������
        return sb.toString();
    }
}
