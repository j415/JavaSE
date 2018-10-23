public class Demo1_3_SuperMan {
    public static void main(String[] args) {
        Person p = new SuperMan();          // 父类引用指向子类对象，超人提升为人，父类引用指向子类对象就是向上转型

        System.out.println(p.name);
        p.business();
        SuperMan s = (SuperMan)p;
        s.fly();
        // p.fly();

        /*
        基本数据类型自动类型提升和强制类型转换
         */
        int i = 10;
        byte b = 20;
        i = b;          // 自动类型提升
        b = (byte)i;    // 强制类型转换

    }
}

class Person {
    String name = "aspiring";

    public void business() {
        System.out.println("谈生意");
    }
}

class SuperMan extends Person{
    String name = "superman";
    public void business(){
        System.out.println("super_生意");
    }
    public void fly(){
        System.out.println("飞出去救人");
    }
}