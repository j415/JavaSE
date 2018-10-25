/*
   A:内部类概述
 * B:内部类访问特点
     * a:内部类可以直接访问外部类的成员，包括私有。
     * b:外部类要访问内部类的成员，必须创建对象。
     * 外部类名.内部类名 对象名 = 外部类对象.内部类对象;
 * C:案例演示
     * 内部类极其访问特点
 */
public class Demo2_1_InnerClass {
    public static void main(String[] args) {
        /*Inner i = new Inner();        错误的创建对象方式
        i.method();*/

        Outer.Inner oi = new Outer().new Inner();
        oi.print();
        oi.num();

    }
}

class Outer{
    private int num = 10;
    class Inner{
        public void print(){
            System.out.println("print");
        }
        public void num(){
            System.out.println(num);
        }
    }
}
