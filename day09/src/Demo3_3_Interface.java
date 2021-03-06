/*
   A:类与类,类与接口,接口与接口的关系
     * a:类与类：
         * 继承关系,只能单继承,可以多层继承。
     * b:类与接口：
         * 实现关系,可以单实现,也可以多实现。
         * 并且还可以在继承一个类的同时实现多个接口。
     * c:接口与接口：
         * 继承关系,可以单继承,也可以多继承。
 */
public class Demo3_3_Interface {
    public static void main(String[] args) {

    }
}
interface  InterA{
    public abstract void printA();
}
interface  InterB{
    public abstract void printB();
}
interface  InterC extends InterA,InterB{
}

// class DemoAB implements InterA,implements InterB{ // 这麽做是不允许的，是非法的
class DemoAB implements InterA,InterB{
    public void printA(){
        System.out.println("printA");
    }
    public void printB(){
        System.out.println("printB");
    }

}