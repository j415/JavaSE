public class Test3_AnonymousInnerClass {
    public static void main(String[] args) {
        //Outer7.method().show();                     // 链式编程:每次调用方法后还能继续调用方法，证明调用方法返回的是对象
        Inter7 i = Outer7.method();
        i.show();
    }
}
/*按照要求，补齐代码: 要求在控制台输出”aspiring”*/

interface Inter7 {
    void show();
}

class Outer7 {
    //补齐代码
    public static Inter7 method(){
        return new Inter7() {
            public void show(){
                System.out.println("aspiring");
            }
        };
    }
}
