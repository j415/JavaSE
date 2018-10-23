/*
 * A:final概述
 * B:final修饰特点
       修饰类，类不能被继承
       修饰变量，变量就变成了常量，只能被赋值一次
       修饰方法，方法不能被重写
 * C:案例演示
       final修饰特点
 */
public class Demo3_1_Final {
    public static void main(String[] args) {
        Son6 s = new Son6();
        s.print();

    }
}

/*final class Father6{
    public final void print(){
        System.out.println("访问底层数据资源");
    }
}*/

class Son6 /*extends Father6*/ {
    final int NUM = 10;         // 常量命名规范，如果是一个单词，所有字母大写，如果是多个单词，每个单词都大写，中间用下划线隔开
    public static final double PI = 3.14; // final修饰变量，叫做常量，一般会与public static共用

    public void print() {
        // num = 20;
        System.out.println("假装重写");
        System.out.println("NUM = " + NUM);

    }
}