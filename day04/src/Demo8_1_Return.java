public class Demo8_1_Return {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                //  break;                      // 跳出循环
                return;                         //返回的意思，用来返回方法
            }
        }
        System.out.println("循环结束");

    }
}
