/*
   A:StringBuffer��ɾ������
     * public StringBuffer deleteCharAt(int index):
         * ɾ��ָ��λ�õ��ַ��������ر���
     * public StringBuffer delete(int start,int end):
         * ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���
 */
package com.heima.stringbuffer;

public class Demo1_3_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // sb.deleteCharAt(5);                 // �����������������û��Ԫ�ص�ʱ��ͻᱨStringIndexOutOfBoundsException

        sb.append("aspiring");
        // sb.deleteCharAt(2);                     // ��������ɾ������λ���϶�Ӧ���ַ�
        // sb.delete(3,8);
        // System.out.println(sb);

        // sb.delete(0,sb.length());            // ��ջ�����
        // System.out.println(sb);

        sb = new StringBuffer();                // ��Ҫ�����ַ�ʽ��ջ�������ԭ���Ļ����������˷��ڴ�
        System.out.println(sb);

    }
}
