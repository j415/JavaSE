/*
   A:案例演示
     * 需求：模拟登录,给三次机会,并提示还有几次。
     * 用户名和密码都是admin
 */
package com.heima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /* 分析
         * 1.模拟登录，需要键盘录入，Scanner
         * 2.给三次机会，需要循环，for
         * 3.并提示有几次，需要判断，if

         */
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("请输入账号：");
            String id = sc.nextLine();
            System.out.print("请输入密码：");
            String ps = sc.nextLine();
            // 如果是字符串常量和字符串变量比较，通常都是字符串常量调用方法，将变量当作参数，防止空指针异常
            if ("admin".equals(id) && "admin".equals(ps)) {
                System.out.println("输入正确");
                break;
            } else {
                if (i==3){
                    System.out.println("您的错误次数用完，请下次再来");
                }else {
                    System.out.println("输入错误,您还有" + (3 - i) + "次机会！！！");
                }

            }
        }


    }
}
