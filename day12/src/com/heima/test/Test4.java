/*
  A:案例演示
	* 需求：把一个字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
	* 链式编程：只要保证每次调用完方法返回的是对象，就可以继续调用
 */
package com.heima.test;

public class Test4 {
    public static void main(String[] args) {
        String s = "aJjkJKjHhUHUhjj";
        // 法1   黑马讲师
        String s1 = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
        System.out.println(s1);
        // 法2   自己思想
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                System.out.print(s.substring(i, i + 1).toUpperCase());
            } else {
                System.out.print(s.substring(i, i + 1).toLowerCase());
            }
        }

    }
}
