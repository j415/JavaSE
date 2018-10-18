import java.util.Scanner;

public class Test4_1_Method {
    public static void main(String[] args) {
        /*
         * A:案例演示
              需求：键盘录入两个数据，返回两个数中的较大值
         * B:案例演示
              需求：键盘录入两个数据，比较两个数是否相等
         */

        Scanner sc = new Scanner(System.in);        // 创建键盘录入对象

        // 键盘录入两个数据，返回两个数中的较大值
        System.out.print("请输入a:");
        int a = sc.nextInt();
        System.out.print("请输入b:");
        int b = sc.nextInt();
        int max = max(a, b);
        System.out.println("较大值max = " + max);

        // 键盘录入两个数据，比较两个数是否相等
        System.out.print("请输入c:");
        int x = sc.nextInt();
        System.out.print("请输入d:");
        int y = sc.nextInt();
        boolean bl = equal(x, y);
        System.out.println("两个值是否相等：" + bl);
    }

    /* 返回两个数中的较大值
     1.明确返回值类型 int
     2.明确参数列表 int a, int b
      */
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    /* 比较两个数是否相等
     1.明确返回值类型 boolean
     2.明确参数列表 int x, int y
     */
    public static boolean equal(int x, int y) {
        return x == y;
    }
}
