/*
   A:案例演示
 *
     需求：把字符串反转
         举例：键盘录入"abc"
         输出结果："cba"

     用StringBuffer的功能实现
 */
package com.heima.test;

import java.util.Scanner;

public class Test1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入字符串:");
        String line = sc.nextLine();
        String s = revString(line);
        System.out.println(s);


    }
    /*
     * 将字符串反转
     * 1,返回值类型String
     * 2,参数列表String line
     */
    private static String revString(String line){
        StringBuffer sb = new StringBuffer(line);       // 将字符串转换成StringBuffer对象
        sb.reverse();                                   // 反转缓冲区的内容
        return sb.toString();
    }
}
