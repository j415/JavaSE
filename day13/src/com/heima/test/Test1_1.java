/*
   需求：把数组中的数据按照指定个格式拼接成一个字符串
 *
     举例：
         int[] arr = {1,2,3};
     输出结果：
         "[1, 2, 3]"

 用StringBuffer的功能实现
 */
package com.heima.test;

public class Test1_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = array2String(arr);
        System.out.println(s);

    }
    /*
     * 将数组转换为字符串
     * 1,返回值类型String
     * 2,参数列表int[]
     *
     * arrayToString 将数组转换为字符串
     * array2String		2与to的发音一样就用2替换了to,后来演变成了一种书写习惯
     * dom4j  domForJ
     */
    private static String array2String(int[] arr){
        StringBuffer sb = new StringBuffer();           // 创建字符串缓冲区
        sb = sb.append("[");                            // 将[添加到缓冲区

        for (int i = 0; i < arr.length-1; i++) {
            if (i != arr.length){
                sb.append(arr[i]);
                sb.append(",");
            }else{
                sb.append(arr[i]);
                sb.append("]");
            }
        }
        return sb.toString();
    }
}
