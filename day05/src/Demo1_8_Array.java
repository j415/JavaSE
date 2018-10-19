/*
 * A:案例演示
       数组遍历：就是依次输出数组中的每一个元素。
       数组的属性:arr.length数组的长度
       数组的最大索引:arr.length - 1;
 */
public class Demo1_8_Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i * 11;
            System.out.println(arr[i - 1]);
        }
        System.out.println("arr的长度：" + arr.length);
        System.out.println("-----------------------");
        int[] arr2 = new int[]{11, 22, 33, 44, 55};
        print(arr2);
    }

    /*
    数组的遍历
    1.返回值类型void
    2.参数列表int[] arr
     */
    public static void print(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] / 11 + " ");
        }
    }
}
