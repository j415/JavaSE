/*
 * A:案例演示
 * 键盘录入练习：键盘录入两个数据，比较这两个数据是否相等
 * B:案例演示
 * 键盘录入练习：键盘录入三个数据，获取这三个数据中的最大值
 */

import java.util.Scanner;

public class Test3_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // 创建录入对象

        // 键盘录入两个数据，比较这两个数据是否相等
        System.out.print("请输入第一个整数：");
        int a = sc.nextInt();                       // 将键盘录入的数据存储在变量a中
        System.out.print("请输入第二个整数：");
        int b = sc.nextInt();
        boolean c = (a == b);
        System.out.println("a与b大小相等为：" + c);
//        System.out.println(a == b );

        // 键盘录入三个数据，获取这三个数据中的最大值
        System.out.print("请输入第一个整数：");
        int l = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int m = sc.nextInt();
        System.out.print("请输入第三个整数：");
        int n = sc.nextInt();
        int temp = (l > m) ? l : m;
        int max = (temp > n) ? temp : n;
        System.out.println("最大值max = " + max);

    }
}
