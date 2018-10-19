public class Demo1_9_Array {
    public static void main(String[] args) {
        /*
         * A:案例演示
               数组获取最值(获取数组中的最大值最小值)
         */

        int[] arr = {4, 2, 999, -7777, 6};
        getMaxMin(arr);
    }

    public static void getMaxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            max = (max > arr[i]) ? max : arr[i];
            min = (min < arr[i]) ? min : arr[i];
        }
        System.out.println("最大值max:" + max + ",最小值min:" + min);
        return;
    }
}
