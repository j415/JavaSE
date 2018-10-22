import java.security.PublicKey;

/*
 * A:Java中类的继承特点
       a:Java只支持单继承，不支持多继承。(一个儿子只能有一个爹)
           有些语言是支持多继承，格式：extends 类1,类2,...
       b:Java支持多层继承(继承体系)
 * B:案例演示
       Java中类的继承特点
       如果想用这个体系的所有功能用最底层的类创建对象
       如果想看这个体系的共性功能,看最顶层的类
 */
public class Demo2_2_Extends {
    public static void main(String[] args) {
        DemoC c = new DemoC();
        c.showc();

    }
}

class DemoA{
    public void showa(){
        System.out.println("DemoA");
    }
}
class DemoB extends DemoA{
    public void showb(){
        System.out.println("DemoB");
    }
}
class DemoC extends DemoB{
    public void showc(){
        System.out.println("DemoC");
    }
}

