import java.lang.invoke.SwitchPoint;

/*
* A:switch语句的格式
*
		switch(表达式) {       // 基本数据类型可以接受byte，short，char，int
		      case 值1：       // 引用数据类型可以接收枚举(JDK1.5)，String(JDK1.7)
				语句体1;
				break;
			    case 值2：
				语句体2;
				break;
			    …
			    default：
				语句体n+1;
				break;
	    }

* B:switch语句的格式解释
* C:面试题
	* byte可以作为switch的表达式吗?
	* long可以作为switch的表达式吗?
	* String可以作为switch的表达式吗?
* C:执行流程
	* 先计算表达式的值
	* 然后和case后面的匹配，如果有就执行对应的语句，否则执行default控制的语句
 */
public class Demo8_1_Switch {               // 选择结构
    public static void main(String[] args) {
        String name = "李";
        String gender = "女";

        switch (gender) {
            case "男":
                System.out.println(name + "是一位" + gender + "性，喜欢看书，听歌，旅游");
                break;
            case "女":
                System.out.println(name + "是一位" + gender + "性，喜欢阅读，音乐，游玩");
                break;
            default:
                System.out.println(name + "是一位" + gender + "性，喜欢不喜欢的喜欢");
                break;
        }

    }
}
