/*
 A:JDK5��������
     * �Զ�װ�䣺�ѻ�������ת��Ϊ��װ������
     * �Զ����䣺�Ѱ�װ������ת��Ϊ��������
 * B:������ʾ
     * JDK5���������Զ�װ��Ͳ���

     * Integer ii = 100;
     * ii += 200;
 * C:ע������
     * ��ʹ��ʱ��Integer  x = null;����ͻ����NullPointerException��
     * �������ж��Ƿ�Ϊnull��Ȼ����ʹ�á�
 */
package com.heima.wrapclass;

public class Demo3_4_Integer {
    public static void main(String[] args) {
        int x = 100;
        Integer i1 = new Integer(x);        // �������������Ͱ�װ�ɶ���װ��

        int y = i1.intValue();              // ������ת���ɻ����������ͣ�����

        Integer i2 = 100;                   // �Զ�װ�䣬�ѻ�����������ת���ɶ���
        int z = i2 + 100;                   // �Զ����䣬�Ѷ���ת���ɻ�����������
        System.out.println(z);

        Integer i3 = null;
        int a = i3 + 200;               // �ײ���i3����intValue,����i3��null,null���÷���
        System.out.println(a);          // �ͻ���ֿ�ָ���쳣java.lang.NullPointerException

    }
}
