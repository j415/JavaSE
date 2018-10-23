/*
 * A:猫狗案例分析
 * B:案例演示
       猫狗案例继承版
       属性:毛的颜色,腿的个数
       行为:吃饭
       猫特有行为:抓老鼠catchMouse
       狗特有行为:看家lookHome
 */
public class Test5_Animal {
    public static void main(String[] args) {
        Cat1 c = new Cat1("red", 4);
        c.eat();
        c.catchMouse();
        System.out.println(c.getColor() + "-^-" + c.getLeg());
        System.out.println("-----------------");
        Dog1 d = new Dog1();
        d.eat();
        d.setColor("black");
        d.setLeg(4);
        d.lookHome();
        System.out.println(c.getColor() + "-^-" + c.getLeg());

    }
}

class Animal2 {
    private String color;
    private int leg;

    public Animal2() {

    }

    public Animal2(String color, int leg) {
        this.color = color;
        this.leg = leg;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getLeg() {
        return leg;
    }

    public void eat() {
        System.out.println("吃饭");
    }
}

class Cat1 extends Animal2 {
    public Cat1() {
    }

    public Cat1(String color, int leg) {
        super(color, leg);
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }

}

class Dog1 extends Animal2 {
    public Dog1() {
    }

    public Dog1(String color, int leg) {
        super(color, leg);
    }

    public void lookHome() {
        System.out.println("看家");
    }

}
