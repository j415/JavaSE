/*
* A:案例演示
	* 需求：在控制台输出九九乘法表。
* B:代码优化
*
		注意：
		'\x' x表示任意，\是转义符号,这种做法叫转移字符。

		'\t'	tab键的位置
		'\r'	回车
		'\n'	换行
		'\"'
		'\''
 */
public class Demo4_3_For99 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
        System.out.println("\'");
    }
}
