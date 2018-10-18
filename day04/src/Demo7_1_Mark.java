public class Demo7_1_Mark {                 // mark 标记
    public static void main(String[] args) {
        outer:for (int i = 1; i <= 10; i++) {       // a 就是标号，只要是合法的标识符即可
            System.out.println("i = " + i);
            inner:for (int j = 1;j<= 10;j++){
                System.out.println("j = "+ j);
                break outer;
            }
        }
        System.out.println("spiring00");

        http://www.baidu.com
        System.out.println("spiring01");
    }
}