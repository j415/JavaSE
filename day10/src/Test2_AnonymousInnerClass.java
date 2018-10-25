public class Test2_AnonymousInnerClass {
    public static void main(String[] args) {
        //如何调用PersonDemo中的method方法呢?
        PersonDemo pd = new PersonDemo();
        /*Person s = new Student();
        pd.method(s);*/
        pd.method(new Person() {     // 匿名内部类当作参数传递(本质把匿名内部类看作一个对象)
            public void show() {
                System.out.println("show");
            }
        });

    }
}

//这里写抽象类，接口都行
abstract class Person {
    public abstract void show();
}

class PersonDemo {
    // public void method(Person p) {       //Person p = new Student();
    /*
    Person p = new Person(){
        public void show(){
            System.out.print("show")
        }
    };
     */
    public void method(Person p) {
        p.show();
    }
}
/*
class Student extends Person {
    public void show() {
        System.out.println("show");
    }
}*/
;