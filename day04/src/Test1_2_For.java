public class Test1_2_For {
    public static void main(String[] args) {
        /*
         * A:案例演示
              需求：求出1-10之间数据之和
         * B:学生练习
              需求：求出1-100之间偶数和
              需求：求出1-100之间奇数和
         */
        int sum0 = 0;
        for (int i = 1; i <= 10; i++) {
            sum0 += i;
        }
        System.out.println("1-10之间数据之和:" + sum0);
        System.out.println("--------------------");
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum1 += i;
            } else {
                sum2 += i;
            }
        }
        System.out.println("1-100之间偶数和:" + sum1);
        System.out.println("1-100之间奇数和:" + sum2);


    }
}
