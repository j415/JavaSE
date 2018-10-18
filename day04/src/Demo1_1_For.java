/*
* A:循环结构的分类
	* for,while,do...while
* B:循环结构for语句的格式：
*
		for(初始化表达式;条件表达式;循环后的操作表达式) {
			循环体;
		}
* C执行流程：
	* a:执行初始化语句
	* b:执行判断条件语句,看其返回值是true还是false
		* 如果是true，就继续执行
		* 如果是false，就结束循环
	* c:执行循环体语句;
	* d:执行循环后的操作表达式
	* e:回到B继续。
* D:案例演示
	* 在控制台输出10次"helloworld"
 */
public class Demo1_1_For {                  // 循环语句for语句
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("aspiring:" + i);
        }
    }
}
