import java.util.Scanner;               // 导入包中的类Scanner

public class Test2_Scanner {
    /*
     * A: 案例演示
     * 键盘录入练习：键盘录入两个数据，并对这两个数据求和，输出其结果
     * B: 案例演示
     * 键盘录入练习：键盘录入两个数据，获取这两个数据中的最大值
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 创建键盘录入对象

        // 键盘录入两个数据，并对这两个数据求和，输出其结果
        System.out.println("请输入第一个整数：");
        int x = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int y = sc.nextInt();
        System.out.println("x+y=" + (x + y));

        // 键盘录入两个数据，获取这两个数据中的最大值
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println(max);

    }
}
