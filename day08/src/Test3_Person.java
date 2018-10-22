/*
 * A:案例演示
       使用继承前的学生和老师案例
       属性:姓名,年龄
       行为:吃饭
       老师有特有的方法:讲课
       学生有特有的方法:学习
 */
public class Test3_Person {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.eat();
        s.learn();
        System.out.println("-----------------");
        Teacher t = new Teacher();
        t.eat();
        t.lecture();

    }
}

class Student2 {
    private String name;
    private int age;

    public Student2() {

    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("学生行为:吃饭");
    }

    public void learn() {
        System.out.println("学生特有方法:学习");
    }
}

class Teacher {
    private String name;
    private int age;

    public Teacher() {

    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("老师行为:吃饭");
    }

    public void lecture() {
        System.out.println("老师特有方法:讲课");
    }
}
