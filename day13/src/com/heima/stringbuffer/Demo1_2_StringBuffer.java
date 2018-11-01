/*
   A:StringBuffer����ӹ���
     * public StringBuffer append(String str):
         * ���԰���������������ӵ��ַ�������������,�������ַ�������������
     * public StringBuffer insert(int offset,String str):
         * ��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������
     StringBuffer���ַ���������,��new��ʱ�����ڶ��ڴ洴����һ������,�ײ���һ������Ϊ16���ַ�����
     ��������ӵķ���ʱ,���������´�������,�����ڲ�����ԭ����������ַ�
 */
package com.heima.stringbuffer;

public class Demo1_2_StringBuffer {
    public static void main(String[] args) {
        // demo1();
        demo2();

    }
    private static void demo1(){
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = sb.append(true);
        StringBuffer sb3 = sb.append("heima");
        StringBuffer sb4 = sb.append(1101);

        System.out.println(sb.toString());          //StringBuffer������д��toString����,��ʾ���Ƕ����е�����ֵ
        System.out.println(sb2.toString());
        System.out.println(sb3.toString());
        System.out.println(sb4.toString());
    }
    private static void demo2(){
        StringBuffer sb = new StringBuffer(12345);
        sb.insert(4,"aspiring");                // ��ָ��λ�����Ԫ�أ����û��ָ��λ�õ������ͻᱨ����Խ���쳣

        System.out.println(sb);
    }
}
