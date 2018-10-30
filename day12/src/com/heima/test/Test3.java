/*
 A:案例演示
	* 需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数,其他字符出现的次数。
	* ABCDEabcd123456!@#$%^
	* 分析：字符串是由字符组成的，而字符都是有范围的，通过范围来判断是否包含该字符
	       如果包含就让计数器变量自增
 */
package com.heima.test;

public class Test3 {
    public static void main(String[] args) {
        String s = "ABCDEabcd123456!@#$%^";
        int big_A = 0;
        int small_a = 0;
        int num = 0;
        int other = 0;
        // 1.获取每一个字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);               // 通过索引获取每一个字符
            // 2.判断字符是否在这个范围内
            if (c >= 'A' && c <= 'Z') {
                big_A++;
            } else if (c >= 'a' && c <= 'z') {
                small_a++;
            } else if (c >= '0' && c <= '9') {
                num++;
            } else {
                other++;
            }
        }
        // 3.打印每一个计数器的结果
        System.out.println(s + "中大写字母个数：" + big_A + ",小写字母个数：" + small_a + ",整数个数：" + num + ",其他类型个数：" + other);

    }
}
