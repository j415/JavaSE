public class Test1_FlowerCount_For {        // 水仙花数
    public static void main(String[] args) {
        /*
         * A:案例演示
              需求：统计”水仙花数”共有多少个
         */
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int i_1 = i / 1 % 10;
            int i_10 = i / 10 % 10;
            int i_100 = i / 100 % 10;
            int i_0 = i_100 * i_100 * i_100 + i_10 * i_10 * i_10 + i_1 * i_1 * i_1;
            if (i_0 == i) {
                System.out.println(i + "是水仙花数");
                count += 1;
            }
        }
        System.out.print("水仙花数个数为："+count);

    }
}
