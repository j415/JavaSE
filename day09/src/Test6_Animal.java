/*
   A:案例演示
     * 动物类：姓名，年龄，吃饭，睡觉。
     * 猫和狗
     * 动物培训接口：跳高
 */
public class Test6_Animal {
    public static void main(String[] args) {
        Cat5 c = new Cat5("加菲",2);
        c.eat();
        c.sleep();
        System.out.println("------------------");
        JumpCat jc = new JumpCat();
        jc.setName("加菲2");
        jc.eat();
        jc.sleep();
        jc.jump();

    }
}
abstract class Animal5{
    private String name;                    // 姓名
    private int age;                        // 年龄

    public Animal5(){}                      // 空参
    public Animal5(String name,int age){    // 有参
        this.name = name;
        this.age = age;
    }
    public void setName(String name){       // 设置姓名
        this.name = name;
    }
    public String getName(){                // 获取姓名
        return name;
    }
    public void setAge(int age){            // 设置年龄
        this.age = age;
    }
    public int getAge(){                    // 获取年龄
        return age;
    }
    public abstract void eat();             // 吃饭
    public abstract void sleep();           // 睡觉
}
interface Dump{                             // 跳高的接口
    public void jump();
}

class Cat5 extends Animal5{
    public Cat5(){}                         // 空参
    public Cat5(String name,int age){       // 有参
        super(name,age);
    }
    public void eat(){
        System.out.println(this.getName()+":猫吃鱼");
    }
    public void sleep(){
        System.out.println(this.getName()+":躺着睡");
    }
}
class JumpCat extends Cat5 implements Dump{
    public JumpCat(){}                         // 空参
    public JumpCat(String name,int age){       // 有参
        super(name,age);
    }
    public void jump(){
        System.out.println(this.getName()+":猫跳高");
    }
}
