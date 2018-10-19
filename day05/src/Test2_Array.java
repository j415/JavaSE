/*
* A:案例演示
*
		需求：公司年销售额求和
		某公司按照季度和月份统计的数据如下：单位(万元)
		第一季度：22,66,44
		第二季度：77,33,88
		第三季度：25,45,65
		第四季度：11,66,99
*/
public class Test2_Array {
    public static void main(String[] args) {
        int[][] arr = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("公司年销售总额为：" + sum + "万元");

    }
}
