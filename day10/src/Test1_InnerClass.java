/*要求：使用已知的变量，在控制台输出30，20，10。*/
public class Test1_InnerClass {
    public static void main(String[] args) {
        Outer3.Inner3 oi = new Outer3().new Inner3();
        oi.show();
    }
}

class Outer3 {
    public int num = 10;

    class Inner3 {
        public int num = 20;

        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer3.this.num); // 内部类之所以能获取到外部类的成员，是因为他能获取到外部类的引用 外部类名.this
        }
    }
}