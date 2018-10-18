/*
* A:循环结构while语句的格式：
*
		while循环的基本格式：
		while(判断条件语句) {
			循环体语句;
		}

		完整格式：

		初始化语句;
	    while(判断条件语句) {
			 循环体语句;
			 控制条件语句;
		}
* B:执行流程：
	* a:执行初始化语句
	* b:执行判断条件语句,看其返回值是true还是false
		* 如果是true，就继续执行
		* 如果是false，就结束循环
	* c:执行循环体语句;
	* d:执行控制条件语句
	* e:回到B继续。
* C:案例演示
	* 需求：请在控制台输出数据1-10
 */
public class Demo2_1_While {                // 循环语句while语句
    public static void main(String[] args) {
        int x = 1;
        System.out.print("x = ");
        while (x <= 10) {
            if (x != 10)
                System.out.print(x + ",");
            else {
                System.out.print(x + ";");
            }
            x++;
        }

    }
}
