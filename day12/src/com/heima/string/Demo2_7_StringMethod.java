/*
      A:String的替换功能及案例演示
        * String replace(char old,char new)
        * String replace(String old,String new)
    * B:String的去除字符串两空格及案例演示
        * String trim()
    * C:String的按字典顺序比较两个字符串及案例演示
        * int compareTo(String str)(暂时不用掌握)
        * int compareToIgnoreCase(String str)(了解)
 */

package com.heima.string;

public class Demo2_7_StringMethod {
    public static void main(String[] args) {
        // demo1();
        // demo2();
        demo3();

    }

    private static void demo1() {
        String s = "heima";
        String s2 = s.replace('i', 'a');     // 用o替换i
        System.out.println(s2);

        String s3 = s.replace('z', 'a');     // z不存在，保留原字符不改变
        System.out.println(s3);

        String s4 = s.replace("ei", "asp");
        System.out.println(s4);
    }

    private static void demo2() {
        String s = "   hei   ma   ";
        String s2 = s.trim();
        System.out.println(s2);
    }

    private static void demo3() {
        String s1 = "aa";
        String s2 = "aaaa";

        int num = s1.compareTo(s2);         // 按照码表值比较
        System.out.println(num);

        String s3 = "黑";
        String s4 = "马";
        int num2 = s3.compareTo(s4);
//        System.out.println('黑' + 0);
//        System.out.println("马" + 0);
        System.out.println(num2);       // 暂时不做解释，与老师的输出不一致

        String s5 = "heima";
        String s6 = "HEIMA";
        int num3 = s5.compareTo(s6);
        System.out.println(num3);
        int num4 = s5.compareToIgnoreCase(s6);
        System.out.println(num4);
        /*
        public int compare(String s1, String s2) {
            int n1 = s1.length();
            int n2 = s2.length();
            int min = Math.min(n1, n2);
            for (int i = 0; i < min; i++) {
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);
                if (c1 != c2) {
                    c1 = Character.toUpperCase(c1);
                    c2 = Character.toUpperCase(c2);
                    if (c1 != c2) {
                        c1 = Character.toLowerCase(c1);
                        c2 = Character.toLowerCase(c2);
                        if (c1 != c2) {
                            // No overflow because of numeric promotion
                            return c1 - c2;
                        }
                    }
                }
            }
            return n1 - n2;
        }
         */
    }
}