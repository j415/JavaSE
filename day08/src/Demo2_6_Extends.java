/*
 * A:案例演示
       父类没有无参构造方法,子类怎么办?
           super解决
           this解决
 * B:注意事项
       super(…)或者this(….)必须出现在构造方法的第一条语句上
 */
public class Demo2_6_Extends {
    public static void main(String[] args) {
        Son4 s1 = new Son4();
        System.out.println(s1.getName()+"---"+s1.getAge());
        System.out.println("----------------------");
        Son4 s2 = new Son4("aspiring_有参",34);
        System.out.println(s2.getName()+"---"+s2.getAge());

    }
}

class Father4 {
    private String name;
    private int age;

//    public Father4() {
//        System.out.println("Father 的空参构造");
//    }

    public Father4(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Father 的有参构造");
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
}

class Son4 extends Father4 {
    public Son4() {
        // super("aspiring_super空参",18);
        this("aspiring_this空参",19);
        System.out.println("Son 的空参构造");
    }

    public Son4(String name, int age) {
        super(name,age);
        System.out.println("Son 的有参构造");
    }
}