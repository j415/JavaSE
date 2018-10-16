public class Test2_DataTypeConversion {
    public static void main(String[] args) {
        //  byte,short,char -- int  --  long  --  float  --  double
        float f = 12.3f;
        long l = 12345;
        f = l;                          // 隐式转换
        System.out.println(f);
        l = (long) f;                    // 强制转换
        System.out.println(l);

        /*
        float占4个字节
        IEEE 754
        32个二进制位
        1位代表是符号位
        8位代表指数位
        00000000 - 111111111
        0 - 255
        255代表无穷大
        1 - 254

        -126 - 127
        23位代表尾数位
         */
    }
}
