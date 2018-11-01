/*
   A:StringBuffer的替换功能
     * public StringBuffer replace(int start,int end,String str):
         * 从start开始到end用str替换
 * B:StringBuffer的反转功能
     * public StringBuffer reverse():
         * 字符串反转
 */
package com.heima.stringbuffer;

public class Demo1_4_StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("aspiring");
        sb.replace(5,8,"e");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}
