/*
   A:��ʽ��������
     * String��Ϊ��������
     * StringBuffer��Ϊ��������
 * B:������ʾ
     * String��StringBuffer�ֱ���Ϊ������������
 *
 �����������͵�ֵ����,���ı���ֵ
 �����������͵�ֵ����,�ı���ֵ

 String����Ȼ��������������,������������������ʱ�ͻ�������������һ����
 */
package com.heima.stringbuffer;

public class Demo1_7_StringBuffer {
    public static void main(String[] args) {
        String s = "aspiring";
        System.out.println(s);
        System.out.println("--------");
        change(s);
        System.out.println(s);

        System.out.println("--------");

        StringBuffer sb = new StringBuffer();
        sb.append("aspire");
        change(sb);
        System.out.println(sb);

    }
    public static void change(String s){
        s+="asp";
    }
    public static void change(StringBuffer sb){
        sb.append("asp");
    }
}
