/*
  A:��ͼ��ʾ
	* ����ͳ�ƴ���С�����ֵĴ���
	* ����Ĵ󴮺�С�������Լ������������
 */
package com.heima.test;

public class Test7 {
    public static void main(String[] args) {
        // �����
        String max = "aspiringisnotaspire,aspiringisagoodman,butaspireisnotaniceman";
        // �����
        String min = "aspiring";
        // �������������
        int count = 0;
        // ��������
        int index = 0;
        // ����ѭ�����ж�С���Ƿ��ڴ���
        while ((index = max.indexOf(min)) != -1) {
            count++;
            max = max.substring(index + min.length());
        }
        System.out.println(count);
    }
}
