/*
   A:案例演示
     * 具体事物：猫，狗
     * 共性：姓名，年龄，吃饭
     * 猫的特性:抓老鼠
     * 狗的特性:看家
 */
public class Test3_Animal {
    public static void main(String[] args) {
        Cat4 c = new Cat4("加菲",4);
        System.out.println(c.getName()+" "+c.getAge());
        c.eat();
        c.catchMouse();
        System.out.println("--------------------");
        Dog4 d = new Dog4("雪糕",3);
        d.eat();
        d.lookHome();

    }
}

abstract class Animal4 {
    private String name;        // 姓名
    private int age;            // 年龄

    public Animal4() {
    }                      // 无参

    public Animal4(String name, int age) {    // 有参
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {       // 设置姓名
        this.name = name;
    }

    public String getName() {                // 获取姓名
        return name;
    }

    public void setAge(int age) {            // 设置年龄
        this.age = age;
    }

    public int getAge() {                    // 获取年龄
        return age;
    }

    public abstract void eat();             // 吃饭
}

class Cat4 extends Animal4 {
    public Cat4() {
    }                      // 无参

    public Cat4(String name, int age) {    // 有参
        super(name,age);
    }

    public void eat() {                      // 吃饭
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
class Dog4 extends Animal4 {
    public Dog4() {
    }                      // 无参

    public Dog4(String name, int age) {    // 有参
        super(name,age);
    }

    public void eat() {                      // 吃饭
        System.out.println("狗吃肉");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}

