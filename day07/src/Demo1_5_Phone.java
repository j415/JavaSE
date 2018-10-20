public class Demo1_5_Phone {
    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.setBrand("华为");
        p1.setPrice(5000);
        p1.show();
        System.out.println("---------------------------");
        System.out.println("品牌:"+p1.getBrand()+", 价格:￥"+p1.getPrice());
        System.out.println("---------------------------");
        Phone p2 = new Phone("小米",3000.0);
        p2.show();

    }
}
/*
手机类
    成员变量：
        品牌:brand，价格:price
    构造方法:
        无参，有参
    成员方法:
        setXxx和getXxx
        show
 */

class Phone{
    private String brand;
    private double price;

    public Phone(){
    }

    public Phone(String brand,double price){
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void show(){
        System.out.println("手机品牌:"+brand+", 手机价格:￥"+price);
    }
}