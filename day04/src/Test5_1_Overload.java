public class Test5_1_Overload {
    public static void main(String[] args) {
        /*
         * A:案例演示
               需求：比较两个数据是否相等。
               参数类型分别为两个int类型，两个double类型，并在main方法中进行测试
         */

        boolean b1 = isEquals(4,6);
        System.out.println("b1 = "+ b1);

        boolean b2 = isEquals(4.0,4.0);
        System.out.println("b2 = "+ b2);

    }

    // 两个int类型
    public static boolean isEquals(int a, int b){
        return a == b;
    }
    // 两个int类型
    public static boolean isEquals(double a, double b){
        return a == b;
    }

}
