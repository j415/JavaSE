/*
* A:if语句的格式3：
*
		if(比较表达式1) {
			语句体1;
		}else if(比较表达式2) {
			语句体2;
		}else if(比较表达式3) {
			语句体3;
		}
		...
		else {
			语句体n+1;
		}
* B:执行流程：
	* 首先计算比较表达式1看其返回值是true还是false，
	* 如果是true，就执行语句体1，if语句结束。
	* 如果是false，接着计算比较表达式2看其返回值是true还是false，

	* 如果是true，就执行语句体2，if语句结束。
	* 如果是false，接着计算比较表达式3看其返回值是true还是false，

	* 如果都是false，就执行语句体n+1。
* C:注意事项:最后一个else可以省略,但是建议不要省略,可以对范围外的错误值提示
 */
public class Demo7_5_If {
    public static void main(String[] args) {
        int x = 1;
        if (x == 1) {
            System.out.println("x为1");
        } else if (x == 0) {
            System.out.println("x为0");
        } else {
            System.out.println("想不到还有else吧");
        }

    }
}
