/*
 * A:画图演示
       画图说明一个对象的创建过程做了哪些事情?
       Student s = new Student();
       1,Student.class加载进内存
       2,声明一个Student类型引用s
       3,在堆内存创建对象,
       4,给对象中属性默认初始化值
       5,属性进行显示初始化
       6,构造方法进栈,对对象中的属性赋值,构造方法弹栈
       7,将对象的地址值赋值给s
 */
public class Demo2_1_Student {              // 创建对象的步骤
    public static void main(String[] args) {
        Student1 s = new Student1();        // 2,声明一个Student类型引用s
        s.show();                           // 7,将对象的地址值赋值给s
    }
}

class Student1 {                         // 1,Student.class加载进内存
    private String name = "漳卅";        // 3,在堆内存创建对象,4,给对象中属性默认初始化值,5,属性进行显示初始化
    private int age = 21;               // 3,在堆内存创建对象,4,给对象中属性默认初始化值,5,属性进行显示初始化

    public Student1() {                 // 6,构造方法进栈,对对象中的属性赋值,构造方法弹栈
        name = "丽萨";
        age = 23;
    }

    public void show() {
        System.out.println(name + "---" + age);
    }
}
