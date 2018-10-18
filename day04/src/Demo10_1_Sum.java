public class Demo10_1_Sum {
    public static void main(String[] args) {
        /*
         * A:如何写一个方法
               1,明确返回值类型
               2,明确参数列表
         * B:案例演示
               需求：求两个数据之和的案例
               C:方法调用图解
         */
        int sum = add(10, 20);
        System.out.println(sum);

        add(30, 40);     // 有返回值方法的单独调用，没有意义
        System.out.println(add(40, 50));     // 这样调用是可以，but如果需要这个结果不推荐这样调用
    }

    /*
    求两个整数的和
    1.整数的和结果应该还是整数
    2.有两个未知内容

    如何写方法
    1.明确返回值类型
    2.明确参数列表
     */
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;                 // 如果有返回值必须用return语句带回
    }


}
