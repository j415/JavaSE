/*
   A:String类的判断功能
     * boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
     * boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
     * boolean contains(String str):判断大字符串中是否包含小字符串
     * boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
     * boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾
     * boolean isEmpty():判断字符串是否为空。
     *
     * ""和null的区别
     * ""是字符串常量，同时也是一个String类的对象，既然是对象当然可以调用String类中的方法
     * null是空常量，不能调用任何的方法，否则会出现空指针异常，null常量可以给任意的引用数据类型赋值
 */
package com.heima.string;

public class Demo2_4_StringMethod {
    public static void main(String[] args) {
        // demo1();
        // demo2();
        demo3();


    }

    private static void demo1() {
        String s1 = "heima";
        String s2 = "heima";
        String s3 = "Heima";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("-----------------");
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
    private static void demo2(){
        String s1 = "aspiring,heima，aspire";
        String s2 = "heima";
        String s3 = "baima";
        String s4 = "aspiring";
        String s5 = "aspire";

        System.out.println(s1.contains(s2));        // 判断是否包含传入的字符串
        System.out.println(s1.contains(s3));
        System.out.println("--------------");
        System.out.println(s1.startsWith(s4));      // 判断是否已传入的字符串开头
        System.out.println(s1.startsWith(s5));
        System.out.println("--------------");
        System.out.println(s1.endsWith(s4));        // 判断是否已传入的字符串结尾
        System.out.println(s1.endsWith(s5));

    }
    private static void demo3(){
        String s1 = "heima";
        String s2 = "";
        String s3 = null;

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());           // java.lang.NullPointerException
    }


}
