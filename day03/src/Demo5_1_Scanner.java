/*
 * a:导包
 * 格式：
 * import java.util.Scanner;
 * 位置：
 * 在class上面。
 * b:创建键盘录入对象
 * 格式：
 * Scanner sc = new Scanner(System.in);
 * c:通过对象获取数据
 * 格式：
 * int x = sc.nextInt();
 */
import java.util.Scanner;
public class Demo5_1_Scanner {              // 键盘录入数据
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // 创建键盘录入对象
        System.out.println("请输入一个整数：");
        int x = sc.nextInt();                       // 将键盘录入的数据存储在x中
        System.out.println(x);

        //  录入两个整数
        Scanner sc1 = new Scanner(System.in);       // 创建键盘录入对象
        System.out.println("请输入第一个整数：");
        int a = sc1.nextInt();                      // 将键盘录入的数据存储在a轴中
        System.out.println(a);

        System.out.println("请输入第二个整数：");
        int b = sc1.nextInt();                      // 将键盘录入的数据存储在b轴中
        System.out.println(b);

    }
}
