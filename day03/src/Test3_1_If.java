import java.util.Scanner;

public class Test3_1_If {
    public static void main(String[] args) {
        /*
        * A:练习1
        *
                需求：键盘录入一个成绩，判断并输出成绩的等级。
                90-100 优
                80-89  良
                70-79  中
                60-69  及
                0-59   差

        * B:练习2
            * 需求：
                * 键盘录入x的值，计算出y的并输出。

                * x>=3	y = 2 * x + 1;
                * -1<x<3	y = 2 * x;
                * x<=-1	y = 2 * x - 1;
         */
        Scanner sc = new Scanner(System.in);

        // 键盘录入一个成绩，判断并输出成绩的等级。
        System.out.print("请输入一个成绩：");
        int a = sc.nextInt();
        if (a > 89 && a <= 100) {
            System.out.println("成绩为：优");
        } else if (a > 79 && a < 90) {
            System.out.println("成绩为：良");
        } else if (a > 69 && a < 80) {
            System.out.println("成绩为：中");
        }else if (a > 59 && a < 70) {
            System.out.println("成绩为：及");
        } else if (a >= 0 && a < 60) {
            System.out.println("成绩为：差");
        } else {
            System.out.println("成绩输入错误！！！");
        }

        // 键盘录入x的值，计算出y的并输出。
        System.out.print("请输入一个值：");
        int x = sc.nextInt();
        int y;
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (x > -1 & x < 3) {
            y = 2 * x;
        } else {
            y = 2 * x - 1;
        }
        System.out.println("y的值为：" + y);

    }
}
