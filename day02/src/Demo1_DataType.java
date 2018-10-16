public class Demo1_DataType {               // 数据类型
    public static void main(String[] args) {
        // 整数类型
        byte b = 100;               // 占一个字节，-128 到 127
        short s = 20;               // 占两个字节
        int i = 30;                 // 占四个字节  整数默认的数据类型就是int类型
        long x = 8888888888l;       // 占八个字节 long整形后面加L进行标识最好加大写L，因为小写l太像数字1了。
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(x);

        System.out.println(12345 + 5432l);

        //  浮点类型
        float f = 12.3f;    // 占四个字节
        double d = 33.4;    // 占八个字节   小数默认的数据类型是double,double类型后面也可以用D或d标识，但是一般不加
        System.out.println(f);
        System.out.println(d);

        // 字符类型
        char c = 'a';       // 占两个字节
        System.out.println(c);

        // 布尔类型
        boolean bt = true;
        boolean bf = false;
        System.out.println(bt);
        System.out.println(bf);

    }
}
