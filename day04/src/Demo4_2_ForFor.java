/*
* A:案例演示
*
		需求：请输出下列的形状
		*
		**
		***
		****
		*****
 */
public class Demo4_2_ForFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
