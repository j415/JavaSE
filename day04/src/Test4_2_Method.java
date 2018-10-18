import java.util.Scanner;

public class Test4_2_Method {
    public static void main(String[] args) {
        /*
         * A:案例演示
              需求：根据键盘录入的数据输出对应的乘法表
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入整数,范围在1~9之间：");
        int x = sc.nextInt();
        Multip_Table(x);                // 返回值为void类型，单独调用即可。
    }

    public static void Multip_Table(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}
