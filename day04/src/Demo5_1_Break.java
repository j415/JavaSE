/*
 * A:break的使用场景
       只能在switch和循环中
 */
public class Demo5_1_Break {                // 控制语句break语句
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break;                      // 跳出循环
            }
            System.out.println("i = " + i);
        }
    }
}
