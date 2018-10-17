public class Demo4_1_Ternary_Operator {             // 三元运算符
    public static void main(String[] args) {
        // (关系表达式) ? 表达式1 : 表达式2；
        int x = 10;
        int y = 5;
        int z,z1;
        z = (x > y) ? x : y;
        z1 = (x < y) ? x : y;
        System.out.println(z);
        System.out.println(z1);
    }
}
