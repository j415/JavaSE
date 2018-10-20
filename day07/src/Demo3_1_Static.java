public class Demo3_1_Static {
    public static void main(String[] args) {
        Person4 p1 = new Person4();             // 创建对象
        p1.name = "aspiring";                   // 调用姓名属性并赋值
        p1.country = "china";                   // 调用国际属性并赋值
        p1.speak();

        Person4 p2 = new Person4();             // 创建对象
        p2.name = "aspiring02";                   // 调用姓名属性并赋值
        p2.country = "china02";                   // 调用国际属性并赋值
        p2.speak();


    }
}

class Person4 {
    String name;
    String country;

    public void speak() {
        System.out.println(name + "--- " + country);
    }
}
