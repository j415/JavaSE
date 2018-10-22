/*
 * A:案例演示
       使用继承后的学生和老师案例
 */
public class Test4_Person {
    public static void main(String[] args) {
        Student4 s = new Student4("aspiring_stu01",18);
//        s.setName("aspiring_stu");
//        s.setAge(19);
        System.out.println(s.getName() + "--" + s.getAge());
        s.eat();
        s.learn();
        System.out.println("-------------");
        Teacher3 t = new Teacher3();
        t.setName("aspiring_tea");
        t.setAge(20);
        System.out.println(t.getName() + "--" + t.getAge());
        t.eat();
        t.lecture();

    }
}


class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
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
        System.out.println(name + "行为:吃饭");
    }
}

class Student4 extends Person {
    public Student4(){

    }
    public Student4(String name,int age){
        super(name,age);
    }
    public void learn() {
        System.out.println(super.getName()+"学生特有方法:学习");
    }
}

class Teacher3 extends Person {
    public Teacher3(){

    }
    public Teacher3(String name,int age){
        super(name,age);
    }
    public void lecture() {
        System.out.println("老师特有方法:讲课");
    }
}