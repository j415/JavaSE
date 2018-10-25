public class Demo2_2_InnerClass {
    public static void main(String[] args) {
        /*Outer1.Inner1 oi = new Outer1().new Inner1();     // 访问方式错误
        oi.num();*/
        Outer1 o = new Outer1();
        o.print();

    }
}
class Outer1{
    private int num = 10;
    private class Inner1{
        public void num(){
            System.out.println(num);
        }
    }
    public void print(){
        Inner1 i = new Inner1();
        i.num();
    }
}