public class Test1_Ternary_Operator {
    public static void main(String[] args) {
        /*
         * A:案例演示
         * 比较两个整数是否相同
         * B:案例演示
         * 获取三个整数中的最大值
         */

        // 比较两个整数是否相同
        int x = 10;
        int y = 5;
        // boolean b = (x == y) ? true : false;
        boolean b = (x == y);
        System.out.println("b = " + b);

        // 获取三个整数中的最大值
        int l = 10;
        int m = 20;
        int n = 30;

        // 先比较任意两个数的值，找出这两个数中的最大值
        int temp = (l > m) ? l : m;
        // 用前两个数的最大值与第三个数比较，获取最大值
        int max = (temp > n) ? temp : n;
        System.out.println("max = " + max);

    }
}
