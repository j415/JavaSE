/*
  A:������ʾ
	* ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
		* ������
			* int[] arr = {1,2,3};
		* ��������
			* "[1, 2, 3]"
    * ������
    * 1.��Ҫ����һ���ַ���"["
    * 2.���������ȡÿһ��Ԫ��
    * 3.���ַ����������е�Ԫ�ؽ���ƴ��
 */
package com.heima.test;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                s = s + arr[i] + ",";
            } else {
                s = s + arr[i] + "]";
            }
        }
        System.out.println(s);
    }
}
