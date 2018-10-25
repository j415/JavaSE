public class Demo2_3_StaticInnerClass {     // 静态内部类
    public static void main(String[] args) {
        // 外部类名.内部类名 对象名 = 外部类名.内部类对象;
        Outer2.Inner2 oi = new Outer2.Inner2();
        oi.method();
        Outer2.Inner21.print();

    }
}

class Outer2 {
    static class Inner2 {
        public void method() {
            System.out.println("method");
        }
    }

    static class Inner21 {
        public static void print() {
            System.out.println("print");
        }
    }
}