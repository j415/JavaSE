/*
 * A:案例演示
 * 需求：猜数字小游戏(数据在1-100之间)
 */

import java.util.Scanner;

public class Test3_GuessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            //  创建键盘录入对象
        System.out.println("请输入一个整数，范围在1-100之间：");
        int guessNum = (int) (Math.random() * 100 + 1); // 心里想的随机数
        while (true) {                                  // 因为需要猜很多次，所以用无限循环
            int result = sc.nextInt();                  // 大家猜的数
            if (result < guessNum) {                    // 猜的数大于心里想的随机数
                System.out.println("小了");
            } else if (result > guessNum) {             // 猜的数大于心里想的随机数
                System.out.println("大了");
            } else {                                    // 猜的数不大也不小，那便是相等了
                System.out.println("bingo");
                break;                                  // 相等便退出循环
            }
        }
    }
}
