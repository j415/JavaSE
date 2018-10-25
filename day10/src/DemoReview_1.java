public class DemoReview_1 {
    public static void main(String[] args) {
        Personi p = new Personi();
        //p.Personi();

    }
}

class Personi{
    // public void Personi(){              // 不是构造方法，是一个普通方法
    public Personi(){                      // 这个才是构造方法
        System.out.println("aspiring");
    }
}