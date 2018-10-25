/*
* A:匿名内部类
	* 就是内部类的简化写法。
* B:前提：存在一个类或者接口
	* 这里的类可以是具体类也可以是抽象类。
* C:格式：
*
		new 类名或者接口名(){
			重写方法;
		}
* D:本质是什么呢?
	* 是一个继承了该类或者实现了该接口的子类匿名对象。
* E:案例演示
	* 按照要求来一个匿名内部类
 */
public class Demo2_5_AnonymousInnerClass {      // 匿名内部类
    public static void main(String[] args) {
        Outer5 o = new Outer5();
        o.method();

    }
}

interface Inter {
    public void print();
}

class Outer5 {
    class Inner5 implements Inter {
        public void print() {
            System.out.println("print");
        }
    }

    public void method() {
        /*Inner5 i = new Inner5();
        i.print();*/
        //new Inner().print();
        //Inter i = new Inner();			//父类引用指向子类对象

        new Inter() {                        //实现Inter接口
            public void print() {            //重写抽象方法
                System.out.println("print");
            }
        }.print();
    }
}
