/*
   A:StringBuffer�Ľ�ȡ����
     * public String substring(int start):
         * ��ָ��λ�ý�ȡ��ĩβ
     * public String substring(int start,int end):
         * ��ȡ��ָ��λ�ÿ�ʼ������λ�ã�������ʼλ�ã�����������λ��
 * B:ע������
     * ע��:����ֵ���Ͳ�����StringBuffer����(����String)
 */
package com.heima.stringbuffer;

public class Demo1_5_StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("aspiring");
        // String str = sb.substring(0,3);
        // System.out.println(str);

        // System.out.println(sb);

        String str3 = sb.substring(5,8);
        System.out.println(str3);

    }
}
