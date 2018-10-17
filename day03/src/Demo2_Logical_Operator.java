public class Demo2_Logical_Operator {
    /*
    && 与 & 的区别
        * a: 最终结果一样
        * b: &&具有短路效果。左边是false，右边不执行
    || 与 | 的区别
        * a: 最终结果一样
        * b: ||具有短路效果，左边为true，右边不执行
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a < b && b < c);          // true && true      = true
        System.out.println(a < b && b > c);          // true && false     = false
        System.out.println(a > b && b < c);          // false && true     = false
        System.out.println(a > b && b > c);          // false && false    = false
        System.out.println("-----------------------------");

        int x = 3;
        int y = 4;
        System.out.println((++x == 3) & (++y == 4));        // false & false = false
        System.out.println("x = " + x);                     // x = 4
        System.out.println("y = " + y);                     // y = 5
        System.out.println("-----------------------------");
        int x1 = 3;
        int y1 = 4;
        System.out.println((++x1 == 3) && (++y1 == 4));         // false && false = false
        System.out.println("x1 = " + x1);                       // x1 = 4
        System.out.println("y1 = " + y1);                       // y1 = 5
    }
}
