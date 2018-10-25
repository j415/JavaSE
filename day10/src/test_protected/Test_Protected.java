package test_protected;
public class Test_Protected {
    public static void main(String[] args) {
        Fu f = new Fu();
        f.print();

        Zi z = new Zi();
        z.method();

        other o = new other();
        o.method();

    }
}

class Fu{
    protected String name="name";
    private int age;

    public Fu(){}
    public Fu(String name,int age){
        this.name = name;
        this.age = age;
    }

    protected void print(){
        System.out.println("print");
    }
}

class Zi extends Fu{
    public void method(){
        print();
    }
}
class other extends Fu{
    public void method(){
        System.out.println(name);
    }

}
