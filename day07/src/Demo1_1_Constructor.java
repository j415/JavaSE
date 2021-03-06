/* A:构造方法概述和作用
       给对象的数据(属性)进行初始化
 * B:构造方法格式特点
       a:方法名与类名相同(大小也要与类名一致)
       b:没有返回值类型，连void都没有
       c:没有具体的返回值return;
 */
public class Demo1_1_Constructor {          // constructor 构造方法
    public static void main(String[] args) {
        Person p = new Person();            // ②在一创建对象的时候，系统就帮我调用了构造方法
        // p.Person();                      // ①构造方法不能用对象调用
        p.show();


    }
}

class Person {
    private String name;
    private int age;

    // 构造方法
    public Person() {
        // System.out.println("aspiring");
        // return;                         // 构造方法也是有return语句的，格式是 return;
        name = "张三";
        age = 23;
    }

    public void show() {
        System.out.println(name + "-不过-" + age);
    }
}