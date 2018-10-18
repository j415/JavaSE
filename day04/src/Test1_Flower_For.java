import java.util.Scanner;

public class Test1_Flower_For {
    public static void main(String[] args) {
        /*
         * A:案例演示
              需求：在控制台输出所有的”水仙花数”

              所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
              举例：153就是一个水仙花数。
              153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
         */
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入一个三位整数：");
//        int x = sc.nextInt();
        for (int x = 100; x < 1000; x++) {
            int x_100 = x / 100 % 10;
            int x_10 = x / 10 % 10;
            int x_1 = x / 1 % 10;
            int x_0 = x_100 * x_100 * x_100 + x_10 * x_10 * x_10 + x_1 * x_1 * x_1;
            if (x_0 == x) {
                System.out.println(x + "是水仙花数");
//            } else {
//                System.out.println(x + "不是水仙花数");
            }
        }

    }
}
