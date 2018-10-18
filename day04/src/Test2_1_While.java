public class Test2_1_While {
    public static void main(String[] args) {
        /*
         * A:求和思想
               求1-100之和
         * B:统计思想
               统计”水仙花数”共有多少个
         */

        // 求1-100之和
        int x = 1;
        int sum = 0;
        while (x <= 100) {
            sum += x;
            x++;
        }
        System.out.println("sum = " + sum);

        // 统计”水仙花数”共有多少个
        int y = 100;
        int count = 0;
        while (y < 1000) {
            int y_1 = y / 1 % 10;
            int y_10 = y / 10 % 10;
            int y_100 = y / 100 % 10;
            int y_0 = y_1 * y_1 * y_1 + y_10 * y_10 * y_10 + y_100 * y_100 * y_100;
            if (y_0 == y) {
                System.out.println("三位整数的水仙花数为："+ y_0);
                count++;
            }
            y++;
        }
        System.out.println("三位整数的水仙花个数为：" + count);

        //

    }
}
