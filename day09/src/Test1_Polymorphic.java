/*
 A:看下面程序是否有问题，如果没有，说出结果
  */
class Test1_Polymorphic {
    public static void main(String[] args) {
        Fu f = new Zi();
        // f.method();
        f.show();
    }
}

class Fu {
    public void show() {
        System.out.println("fu show");
    }
}

class Zi extends Fu {
    public void show() {
        System.out.println("zi show");
    }

    public void method() {
        System.out.println("zi method");
    }
}

