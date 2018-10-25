import com.google.Student;

public class DemoReview_2_Override {
    public static void main(String[] args) {

    }
}

class Person2{
    public void print(){
        System.out.println("Person2");
    }
}
class Student2 extends Person2{
    public void print(){
        System.out.println("Student2");
    }
}
class Father2{
    public Person2 method(){
        return new  Person2();
    }
}
class Son2 extends Father2{
    public Student2 method(){
        return new Student2();
    }
}