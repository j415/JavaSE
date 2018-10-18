public class Test4_1_Switch {
    public static void main(String[] args) {
        /*
         * A:整数(给定一个值,输出对应星期几)
         */
        int week = 9;
        switch (week) {
            case 1:
                System.out.println("今天是周一");
                break;
            case 2:
                System.out.println("今天是周二");
                break;
            case 3:
                System.out.println("今天是周三");
                break;
            case 4:
                System.out.println("今天是周四");
                break;
            case 5:
                System.out.println("今天是周五");
                break;
            case 6:
                System.out.println("今天是周六");
                break;
            case 7:
                System.out.println("今天是周日");
                break;
            default:
                System.out.println("数据错误，没有周" + week);
                break;

        }

    }
}
