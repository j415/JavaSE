public class Demo2_2_葵花宝典 {
    public static void main(String[] args) {
        岳不群 岳 = new 岳不群();
        岳.自宫();

    }
}

abstract class 葵花宝典{
    public abstract void 自宫();
}

class 岳不群 extends 葵花宝典{
    public void 自宫(){
        System.out.println("岳不群方法");
    }
}
class 林平之 extends 葵花宝典{
    public void 自宫(){
        System.out.println("林平之方法");
    }
}
class 东方不败 extends 葵花宝典{
    public void 自宫(){
        System.out.println("东方不败方法");
    }
}
