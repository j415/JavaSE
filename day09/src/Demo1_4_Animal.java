/*
 * A:多态的好处
       a:提高了代码的维护性(继承保证)
       b:提高了代码的扩展性(由多态保证)
 * B:案例演示
       多态的好处
       可以当作形式参数,可以接收任意子类对象
 * C:多态的弊端
       不能使用子类的特有属性和行为。
 */
public class Demo1_4_Animal {
    public static void main(String[] args) {
        Cat2 c1 = new Cat2();
        c1.eat();
        System.out.println("-----------------");
        method(new Cat2());
        method(new Dog2());

        // Animal2 a = new Cat2();     // 开发的时候很少在创建对象的时候用父类应用子类对象，直接创建子类对象更方便，可以使用子类中的特殊属性和行为

    }
    // Cat2 c = newe Dog2(); 狗屎一只猫，这是错误的
    /*public static void method(Cat2 c){
        c.eat();
    }
    public static void method(Dog2 d){
        d.eat();
    }*/
    // 如果把狗强转成猫就会出现类型转换异常：ClassCastException
    public static void method(Animal2 a){       // 当作参数的时候用多态最好，因为扩展性强
        // instanceof 判断前边的应用是否是后边的数据类型
        if (a instanceof Cat2) {
            Cat2 cat2 = (Cat2) a;
            cat2.eat();
            cat2.catchMouse();
        }else if (a instanceof Dog2){
            Dog2 d = (Dog2) a;
            d.eat();
            d.lookHome();
        }else {
            a.eat();
        }
    }
}

class Animal2{
    public void eat(){
        System.out.println("动物吃饭");
    }
}

class Cat2 extends Animal2 {
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
class Dog2 extends Animal2 {
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}