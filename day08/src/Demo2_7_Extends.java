/*
 * A:案例演示
       a:不同名的方法
       b:同名的方法
 */
public class Demo2_7_Extends {
    public static void main(String[] args) {
        Son5 s = new Son5();
        s.print();
        s.methed();
        System.out.println("-------------------");
        Father5 f = new Father5();
        f.print();

    }
}

class Father5{
    public void print(){
        System.out.println("Fu print");
    }
}

class Son5 extends Father5{
    public void methed(){
        System.out.println("Zi method");
    }
    public void print(){
        super.print();
        System.out.println("Zi print");
    }
}
