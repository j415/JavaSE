public class Demo2_4_LocalInnerClass {      //局部内部类
    public static void main(String[] args) {
        Outer4 o = new Outer4();
        o.method();

    }
}

class Outer4 {
    public void method() {
        /*final*/ int num = 3; // 从内部类引用的本地变量时，默认给变量加了隐式的final  (注：jdk7没有默认加final，得手动加final)
        // num = 4;            // Error:从内部类引用的本地变量必须是最终变量或实际上的最终变量
        class Inner4 {
            public void print() {
                System.out.println(num);
            }
        }
        Inner4 i = new Inner4();
        i.print();
    }

    /*public void run() {
        Inner4 i = new Inner4();        // 局部内部类，只能在其所在的方法中访问
        i.print();
    }*/
}
