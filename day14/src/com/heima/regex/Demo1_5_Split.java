package com.heima.regex;

public class Demo1_5_Split {
    public static void main(String[] args) {
        String s = "aspiring.aspire.asp";
        String[] arr = s.split("\\.");          // ͨ�������и��ַ���
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
