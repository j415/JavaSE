/*
* A:案例演示
	* 需求：请输出一个4行5列的星星(*)图案。
	*
			如图：
				*****
				*****
				*****
				*****

			注意：
				System.out.println("*");和System.out.print("*");的区别
* B:结论：
	* 外循环控制行数，内循环控制列数
 */
public class Demo4_1_ForFor {               // 循环嵌套
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {               // 外循环
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

