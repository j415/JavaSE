/*
   A:案例演示
     * 具体事物：基础班老师，就业班老师
     * 共性：姓名，年龄，讲课。
     * 具体事物:基础班学生,就业班学生
     * 共性:姓名,年龄,学习
 */
public class Test4_Teacher {
    public static void main(String[] args) {
        BaseTeacher bt = new BaseTeacher("aspiring",25);
        bt.teach();
        BTeacher bbt = new BTeacher("aspiring02",35);
        bbt.teach();

    }
}

abstract class Teacher {
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

    public abstract void teach();
}

class BaseTeacher extends Teacher {
    public BaseTeacher() {
    }

    public BaseTeacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("我的姓名是：" + this.getName() + ",我的年龄是：" + super.getAge() + ",讲的内容是javaSE");
    }
}
class BTeacher extends Teacher {
    public BTeacher() {
    }

    public BTeacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("我的姓名是：" + this.getName() + ",我的年龄是：" + super.getAge() + ",讲的内容不是javaSE");
    }
}