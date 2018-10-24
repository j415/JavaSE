/*
   A:接口成员特点
 * 成员变量；只能是常量，并且是静态的并公共的。
         * 默认修饰符：public static final        三个关键字可以互相交换位置
         * 建议：自己手动给出。
     * 构造方法：接口没有构造方法。
     * 成员方法：只能是抽象方法。
         * 默认修饰符：public abstract
         * 建议：自己手动给出。
 */
public class Demo3_2_Interface {
    public static void main(String[] args) {
        Demo4 d = new Demo4();
        d.print();
        System.out.println(Inter4.num);

    }
}

interface Inter4{
    public static final int num = 10;
    // public Inter4(){}                // 接口中没有构造方法
    // public void print(){}            // 接口中不能定义非抽象类方法，Error: 接口抽象方法不能带有主体

    //public abstract void print();
}
class Demo4 /*extends Object*/ implements Inter4{   // 一个类不写继承任何类，默认继承Object类
    public void print(){
        // num = 20;
        System.out.println(num);
    }
}

