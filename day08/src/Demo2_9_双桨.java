/*
 * A:方法重写注意事项
       a:父类中私有方法不能被重写
           因为父类私有方法子类根本就无法继承
       b:子类重写父类方法时，访问权限不能更低
           最好就一致
       c:父类静态方法，子类也必须通过静态方法进行重写
           其实这个算不上方法重写，但是现象确实如此，至于为什么算不上方法重写，多态中我会讲解(静态只能覆盖静态)

 * 子类重写父类方法的时候，最好声明一模一样。
 */
public class Demo2_9_双桨 {
    public static void main(String[] args) {
        Dayone d = new Dayone();
        d.read();
        d.print();

    }
}

class 双桨{
    public void sing(){
        System.out.println("唱红歌");
    }
    public void read(){
        System.out.println("读红书");
    }
    public static void print(){
        System.out.println("Fu print");
    }
}

class Dayone extends 双桨{
    public void read(){
        System.out.println("read red book");
    }
    public static void print(){             // 静态只能覆盖静态，其实不算重写
        System.out.println("Zi print");
    }
}
