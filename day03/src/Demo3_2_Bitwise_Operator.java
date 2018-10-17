public class Demo3_2_Bitwise_Operator {               // 位运算符
    public static void main(String[] args) {
        /*
         * 位异或运算符的特点
         *
         * ^的特点：一个数据对另一个数据位异或两次，该数本身不变。
         */
        System.out.println(5 ^ 10 ^ 10);
        System.out.println(5 ^ 10 ^ 5);
        System.out.println(5 ^ 5 ^ 10);

        // 试题：请自己实现两个整数变量的交换

        // 需要第三方变量,开发推荐用这种
        int x = 10;
        int y = 5;
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + ",y = " + y);

        // 不需要第三方变量,有弊端，有可能会超出int的取值范围
        int x1 = 10;
        int y1 = 5;
        x1 = x1 + y1;      // 10 + 5 = 15
        y1 = x1 - y1;      // 15 - 5 = 10
        x1 = x1 - y1;      // 15 - 10 = 5
        System.out.println("x1 = " + x1 + ",y1 = " + y1);

        // 不需要第三方变量,通过 异或^来做
        int x2 = 10;
        int y2 = 5;
        x2 = x2 ^ y2;      // 10 ^ 5
        y2 = x2 ^ y2;      // 10 ^ 5 ^ 5    y = 10
        x2 = x2 ^ y2;      // 10 ^ 5 ^ 10   x = 5
        System.out.println("x2 = " + x2 + ",y2 = " + y2);

    }
}
