public class Demo1_4_Array {
    public static void main(String[] args) {
        int[] arr1 = new int[3];            // 创建数组，长度为3
        int[] arr2 = new int[3];            // 创建数组，长度为3

        System.out.println(arr1);           // 打印数组的地址值
        System.out.println(arr2);

        arr1[0] = 10;
        arr2[1] = 20;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        System.out.println("__________________________");

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

    }
}
