/*
   A:StringBuffer���滻����
     * public StringBuffer replace(int start,int end,String str):
         * ��start��ʼ��end��str�滻
 * B:StringBuffer�ķ�ת����
     * public StringBuffer reverse():
         * �ַ�����ת
 */
package com.heima.stringbuffer;

public class Demo1_4_StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("aspiring");
        sb.replace(5,8,"e");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}
