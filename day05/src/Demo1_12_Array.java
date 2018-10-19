public class Demo1_12_Array {
    public static void main(String[] args) {
        /*
         * A:案例演示
         * 数组元素查找(查找指定元素第一次在数组中出现的索引)
         */

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int index = getInder(arr,10);
        System.out.println(index);


    }

    /*
    查找元素索引
    1.返回值类型int
    2.明确参数列表，int[] arr,int value
     */

    public static int getInder(int[] arr,int value){
        for (int i = 0;i<=arr.length-1;i++){
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}
