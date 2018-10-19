/*
 * A:案例演示
 * 需求：二维数组遍历

 * 外循环控制的是二维数组的长度，其实就是一维数组的个数。
 * 内循环控制的是一维数组的长度。

 */
public class Test1_Array {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 5}, {3, 5}, {8, 7, 6, 5, 4, 3}};
//        System.out.println(arr.length);

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
