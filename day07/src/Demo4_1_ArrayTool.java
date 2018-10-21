public class Demo4_1_ArrayTool {
    public static void main(String[] args) {
        int[] arr = {4, 8, 9, 7, 2, 1, 6, 3, 5};
        /*
        ArrayTool at = new ArrayTool();
        int max = at.getMax(arr);
        System.out.println("max=" + max);
        System.out.println("--------");
        at.print(arr);              // 打印
        System.out.println("--------");
        at.revArray(arr);           // 反转
        at.print(arr);              // 反转后打印
        */
        ArrayTool.print(arr);
    }
}
