/*
 * A:案例演示
       方法内部或者方法声明上都演示一下(了解)

       基本类型，是值不能被改变
       引用类型，是地址值不能被改变,对象中的属性可以改变
 */
public class Demo3_2_Final {
    public static void main(String[] args) {
        final int NUM = 10;
        // NUM = 20;
        System.out.println(NUM);

        final Person2 p = new Person2("aspiring",18);
        // System.out.println(p);
        // p = new Person2("aspiring01",19);
        //System.out.println(p);
        p.setName("aspiring02");
        p.setAge(20);
        System.out.println(p.getName()+"....."+p.getAge());

    }
}

class Person2{
    private String name;
    private int age;

    public Person2(){}

    public Person2(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
