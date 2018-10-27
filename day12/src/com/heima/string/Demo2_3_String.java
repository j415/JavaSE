package com.heima.string;

public class Demo2_3_String {
    public static void main(String[] args) {
        // demo1();
        // demo2();
        // demo3();
        // demo4();
        // demo5();
    }

    private static void demo1() {                // 常量池中没有这个 字符串对象，就创建一个，如果有直接用即可
        //1.判断定义为String类型的s1和s2是否相等
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);           // true
        System.out.println(s1.equals(s2));      // true
    }

    private static void demo2() {
        //2.下面这句话在内存中创建了几个对象?
        String s1 = new String("abc");      // 创建两个对象，一个在常量池中，一个在堆内存中
        System.out.println(s1);
    }

    private static void demo3() {
        //3.判断定义为String类型的s1和s2是否相等
        String s1 = new String("abc");  // 记录的是堆内存对象的地址值
        String s2 = "abc";                      // 记录的是常量池中的地址值
        System.out.println(s1 == s2);           // false
        System.out.println(s1.equals(s2));      // true
    }

    private static void demo4() {
        // 4.判断定义为String类型的s1和s2是否相等
        byte b = 3 + 4;                         // 在编译时就变成，把7赋值给b，常量优化机制
        String s1 = "a" + "b" + "c";
        String s2 = "abc";
        //System.out.println(s1);
        System.out.println(s1 == s2);           // true     java中有常量优化机制
        System.out.println(s1.equals(s2));      // true
    }

    private static void demo5() {
        // 5.判断定义为String类型的s1和s2是否相等
        String s1 = "ab";
        String s2 = "abc";
        String s3 = s1 + "c";
        System.out.println(s3 == s2);           // false
        System.out.println(s3.equals(s2));      // true
    }

}
