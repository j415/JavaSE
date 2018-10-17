/*
* A:if语句的格式2
*
		if(比较表达式) {
			语句体1;
		}else {
			语句体2;
		}
* B:执行流程：
	* 首先计算比较表达式的值，看其返回值是true还是false。
	* 如果是true，就执行语句体1；
	* 如果是false，就执行语句体2；
* C:案例演示
	* a:获取两个数据中较大的值
	* b:判断一个数据是奇数还是偶数,并输出是奇数还是偶数

	* 注意事项：else后面是没有比较表达式的，只有if后面有。
 */
public class Demo7_3_If {
    public static void main(String[] args) {
        int x = 1;
        if (x == 1) {
            System.out.println("符合if条件");
        } else {
            System.out.println("符合else条件");
        }

        // 获取两个数据中较大的值
        int a = 10;
        int b = 20;
        int z;
        if (a > b) {
            z = a;
        } else {
            z = b;
        }
        System.out.println(z);

        // 判断一个数据是奇数还是偶数,并输出是奇数还是偶数
        int num = 20;
        if (num % 2 == 0) {
            System.out.println("num为偶数");
        } else {
            System.out.println("num为奇数");
        }
    }
}
