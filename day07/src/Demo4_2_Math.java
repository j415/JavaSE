public class Demo4_2_Math {
    public static void main(String[] args) {
        double d = Math.random();
        System.out.println(d);

        // Math.random() 会生成大于等于0.0并且小于1.0的伪随机数
        for (int i = 1;i<=10;i++){
            System.out.println(Math.random());
        }

        for (int i = 1;i<=10;i++){
            System.out.println((int)(Math.random()*100+1));
        }

    }
}
