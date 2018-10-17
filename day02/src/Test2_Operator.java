public class Test2_Operator {
    public static void main(String[] args) {
        short s = 1;
        // s = s + 1;          // 当short与int进行运算的时候，会提升为int类型，两个int类型相加的结果也是int类型
        short s2 = 1;
        s2 += 1;                // s = (short)(s + 1);

//        System.out.println(s);
        System.out.println(s2);
    }
}
