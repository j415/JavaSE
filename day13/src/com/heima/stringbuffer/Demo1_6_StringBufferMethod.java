/*
   A:String -- StringBuffer
     * a:ͨ�����췽��
     * b:ͨ��append()����
 * B:StringBuffer -- String
     * a:ͨ�����췽��
     * b:ͨ��toString()����
     * c:ͨ��subString(0,length);

 */
package com.heima.stringbuffer;

public class Demo1_6_StringBufferMethod {
    public static void main(String[] args) {
        // demo1();
        demo2();

    }
    private static void demo1(){
        StringBuffer sb1 = new StringBuffer("aspiring");        // ͨ�����췽�����ַ���ת��ΪStringBuffer����
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer();
        sb2.append("aspiring");             // ͨ��append�������ַ���ת����StringBuffer����
        System.out.println(sb2);
    }
    private static void demo2(){
        StringBuffer sb = new StringBuffer("aspiring");

        String s1 = new String(sb);                 // ͨ�����콫StringBufferת��ΪString
        System.out.println(s1);

        String s2 = sb.toString();                  // ͨ��toString������StringBufferת��ΪString
        System.out.println(s2);

        String s3 = sb.substring(0,sb.length());    // ͨ����ȡ���ַ�����StringBufferת��ΪString
        System.out.println(s3);


    }
}
