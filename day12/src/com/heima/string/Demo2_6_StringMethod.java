/*
  A:String的转换功能：
	* byte[] getBytes():把字符串转换为字节数组。
	* char[] toCharArray():把字符串转换为字符数组。
	* static String valueOf(char[] chs):把字符数组转成字符串。
	* static String valueOf(int i):把int类型的数据转成字符串。
		* 注意：String类的valueOf()方法可以把任意类型的数据转成字符串

	* String toLowerCase():把字符串转成小写。(了解)
	* String toUpperCase():把字符串转成大写。
	* String concat(String str):把字符串拼接。
 */
package com.heima.string;

import com.heima.bean.Person;

public class  Demo2_6_StringMethod {
    public static void main(String[] args) {
        // demo1();
        // demo2();
        // demo3();
        demo4();

    }
    private static void demo1(){
        String s1 = "abc";
        byte[] arr = s1.getBytes();
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("--------------------");
        String s2 = "你好你好";
        byte[] arr2 = s2.getBytes();        // 通过gbk码表将字符转换成字节数组
        for (int i = 0;i<arr2.length;i++){  // 编码：把我们读的懂转换为计算机读的懂的
            System.out.print(arr2[i] + " ");// gbk码表一个中文代表两个字节
        }                                   // gbk码表特点：中文的第一个字节肯定是符数
        System.out.println("--------------------");
        String s3 = "琲";
        byte[] arr3 = s3.getBytes();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
    private static void demo2(){
        String s = "heima";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    private static void demo3(){
        char[] arr = {'a','b','c'};
        String s = String.valueOf(arr);     // 底层是由String类的构造方法完成的
        System.out.println(s);

        String s2 = String.valueOf(100);        // 将100装换为字符串
        System.out.println(s2+100);
        Person p1 = new Person("aspiring",23);
        System.out.println(p1);
        String s3 = String.valueOf(p1);     // 调用的是对象的toString方法
        System.out.println(s3);
    }
    private static void demo4(){
        String s1 = "heiMA";
        String s2 = "chengxuYUAN";
        String s1_1 = s1.toLowerCase();
        String s2_2 = s2.toUpperCase();
        System.out.println(s1_1);
        System.out.println(s2_2);

        System.out.println(s1_1+s2_2);              // 用+号拼接字符串更强大，可以用字符串与任意类型相加
        System.out.println(s1_1.concat(s2_2));      // concat只能在字符串String中使用
    }
}
