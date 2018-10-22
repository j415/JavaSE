/*看程序写结果2*/
public class Test2_Extends {
    public static void main(String[] args) {
        Zi2 z2 = new Zi2();
    }
    /*
    1.jvm调用了main方法，main进栈
    2.遇到Zi z = new Zi(); 会先将Fu.class 和Zi.class分别加载进内存，再创建对象，当Fu.class加载进内存
      父类的静态代码块会随着Fu.class一起加载，当Zi.class加载进内存，子类的静态代码块会随着Zi.class一起加载
    3.走Zi类的构造方法，因为java中是分层初始化的，先初始化父类，再初始化子类，所以先走的父类构造，但是在执行
      父类构造时，发现父类有构造代码块，构造代码块是优先构造方法执行。
    4.父类初始化结束，再是子类初始化。

     */
}
class Fu2 {
    static {
        System.out.println("静态代码块Fu");
    }

    {
        System.out.println("构造代码块Fu");
    }

    public Fu2() {
        System.out.println("构造方法Fu");
    }
}

class Zi2 extends Fu2 {
    static {
        System.out.println("静态代码块Zi");
    }

    {
        System.out.println("构造代码块Zi");
    }

    public Zi2() {
        System.out.println("构造方法Zi");
    }
}
