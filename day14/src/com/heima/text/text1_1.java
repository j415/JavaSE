package com.heima.text;

import com.sun.javafx.image.IntPixelGetter;

import java.util.Arrays;

/**
 * * A:������ʾ
 * ������������һ���ַ���:��91 27 46 38 50������д����ʵ�������������ǣ���27 38 46 50 91��
 * 100
 * 80
 * ����:
 * 1,���ַ����и���ַ�������
 * 2,���ַ���ת�������ֲ�����洢��һ���ȳ��ȵ�int������
 * 3,����
 * 4,�������Ľ��������ƴ�ӳ�һ���ַ���
 */
public class text1_1 {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        //1�����ַ����и���ַ�������
        String[] sArr = s.split(" ");
        //2�����ַ���ת�������ֲ�����洢��һ���ȳ���int������
        int[] arr = new int[sArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sArr[i]);         // �������ַ���ת��������
        }
        // 3������
        Arrays.sort(arr);
        // 4,�������Ľ������ƴ�ӳ�һ�ַ���
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str = str + arr[i];
            } else {
                str = str + arr[i] + " ";
            }
        }
        System.out.println(str);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + " ");
            }
        }
        System.out.println(sb);
    }
}
