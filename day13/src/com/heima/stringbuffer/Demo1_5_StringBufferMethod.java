/*
   A:StringBuffer的截取功能
     * public String substring(int start):
         * 从指定位置截取到末尾
     * public String substring(int start,int end):
         * 截取从指定位置开始到结束位置，包括开始位置，不包括结束位置
 * B:注意事项
     * 注意:返回值类型不再是StringBuffer本身(而是String)
 */
package com.heima.stringbuffer;

public class Demo1_5_StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("aspiring");
        // String str = sb.substring(0,3);
        // System.out.println(str);

        // System.out.println(sb);

        String str3 = sb.substring(5,8);
        System.out.println(str3);

    }
}
