/*
 * A:案例演示
 * 数组元素反转(就是把元素对调)
 */
public class Demo1_10_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printReversal(arr);

        System.out.println(arr[1]);
    }

    public static void printReversal(int[] arr) {
        // 反转
        int len = arr.length, temp;
        for (int i = 1; i <= len / 2; i++) {
            temp = arr[i - 1];
            arr[i - 1] = arr[len - i];
            arr[len - i] = temp;
        }
        // 遍历
        for (int i = 0; i <= len - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
