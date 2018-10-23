/*
 * A:final修饰变量的初始化时机
       1.显示初始化
       2.在对象构造完毕前即可
 */
public class Demo3_3_Final {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();
    }
}

class Demo {
    final int NUM = 10;             // 1.显示初始化
    /*final int NUM;
    public Demo(){
        NUM = 10;                   // 2.在对象构造完毕前即可
    }*/

    public void print() {
        System.out.println(NUM);
    }
}