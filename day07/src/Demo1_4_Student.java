/*
 * A:案例演示
       学生类：
       成员变量：
       name，age
       构造方法：
       无参，带两个参
       成员方法：
       getXxx()/setXxx()
       show()：输出该类的所有成员变量值
 * B:给成员变量赋值：
       a:setXxx()方法
       b:构造方法
 */
public class Demo1_4_Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("无参");
        s.setAge(23);
        s.show();
        System.out.println("-------------------------");
        Student s2 = new Student("有参", 24);
        s2.show();                                            // show()方法只是为了显示属性值
        System.out.println("-------------------------");

        System.out.println(s2.getName() + "-" + s2.getAge()); // getXxx()获取属性值,可以打印,也可以赋值给其他的变量,做其他的操作
    }
}

class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
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

    public void show() {
        System.out.println(name + " ^_^ " + age);
    }

}
