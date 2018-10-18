/*
 * A:continue的使用场景
       只能在循环中
 */
public class Demo6_1_Continue {             // 控制语句continue语句
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue;                      // 终止本次循环，继续下次循环
            }
            System.out.println("i = " + i);
        }

    }
}
