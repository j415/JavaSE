/*
  A:������ʾ
	* ���󣺰��ַ�����ת
		* ����������¼��"abc"
		* ��������"cba"
    * ������
    * 1.ͨ������¼���ȡ�ַ���Scanner
    * 2.���ַ���ת�����ַ�����
    * 3.���ű����ַ����飬���ٴ�ƴ�ӳ��ַ���
    * 4.��ӡ
 */
package com.heima.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // ��������¼�����
        System.out.print("������һ���ַ���:");
        String line = sc.nextLine();                // ������¼��Ķ��󴢴���line��
        String s = "";
        char[] arr = line.toCharArray();            // ���ַ���ת�����ַ�����
        for (int i = arr.length - 1; i >= 0; i--) { // ���ű����ַ�����
            s = s + arr[i];                         // ƴ�ӳ��ַ���
        }
        System.out.println(s);

    }
}
