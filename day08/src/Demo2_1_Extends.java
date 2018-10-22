/*
 * A:继承(extends)
      让类与类之间产生关系,子父类关系
 * B:继承案例演示：
      动物类,猫类,狗类
      定义两个属性(颜色,腿的个数)两个功能(吃饭，睡觉)
 * C:案例演示
      使用继承前
 * D:案例演示
      使用继承后
 */
public class Demo2_1_Extends {              // extends 继承
    public static void main(String[] args) {
        Cat c = new Cat();
        c.color = "花";
        c.leg = 4;
        c.eat();
        c.sleep();
        System.out.println(c.leg+"---"+c.color);

    }
}
/*
extends是继承的意思
Animal是符类
Cat和Dog是子类
 */

class Aminal{
    String color;                   // 动物的颜色
    int leg;                        // 腿的个数

    public void eat(){              // 吃饭的功能
        System.out.println("吃饭");
    }
    public void sleep(){            // 睡觉的功能
        System.out.println("睡觉");
    }
}

class Cat extends Aminal{
//    String color;                   // 动物的颜色
//    int leg;                        // 腿的个数
//
//    public void eat(){              // 吃饭的功能
//        System.out.println("吃饭");
//    }
//    public void sleep(){            // 睡觉的功能
//        System.out.println("睡觉");
//    }
}

class Dog extends Aminal{
//    String color;                   // 动物的颜色
//    int leg;                        // 腿的个数
//
//    public void eat(){              // 吃饭的功能
//        System.out.println("吃饭");
//    }
//    public void sleep(){            // 睡觉的功能
//        System.out.println("睡觉");
//    }
}