/*
  A:画图演示
	* 需求：统计大串中小串出现的次数
	* 这里的大串和小串可以自己根据情况给出
 */
package com.heima.test;

public class Test7 {
    public static void main(String[] args) {
        // 定义大串
        String max = "aspiringisnotaspire,aspiringisagoodman,butaspireisnotaniceman";
        // 定义大串
        String min = "aspiring";
        // 定义计数器变量
        int count = 0;
        // 定义索引
        int index = 0;
        // 定义循环，判断小串是否在大串中
        while ((index = max.indexOf(min)) != -1) {
            count++;
            max = max.substring(index + min.length());
        }
        System.out.println(count);
    }
}
