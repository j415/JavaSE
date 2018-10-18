/*
 * A:案例演示
 * 需求：获取三个数据中的最大值
 * if语句的嵌套使用。
 */
public class Test3_2_If {
    public static void main(String[] args) {
        int a = 221;
        int b = 20;
        int c = 34;
        if (a > b) {
            if (a > c) {
                System.out.println("最大值为：" + a);
            } else {
                System.out.println("最大值为：" + c);
            }
        } else {
            if (b > c) {
                System.out.println("最大值为：" + b);
            } else {
                System.out.println("最大值为：" + c);
            }
        }

    }
}
