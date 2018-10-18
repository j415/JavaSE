import java.util.Scanner;

public class Test4_3_Switch {
    public static void main(String[] args) {
        /*
         * 键盘录入月份，输出对应的季节
         * 一年有四季
         * 3,4,5春季
         * 6,67,8夏季
         * 9,10,11秋季
         * 12,1,2冬季
         */

        Scanner sc = new Scanner(System.in);
        //switch
        System.out.print("请输入一个月份：");
        int month = sc.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println(month + "月为春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month + "月为夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month + "月为秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(month + "月为冬季");
                break;
            default:
                System.out.println("录入错误月份！！！");
        }
        // 用if语句来完成月份对应季节
        if(month>=3 && month<=5){
            System.out.println(month + "月为春季!");
        }else if(month>=6 &&month<=8){
            System.out.println(month + "月为夏季!");
        }else if(month>=9 &&month<=11){
            System.out.println(month + "月为秋季!");
        }else if(month ==12 || month==1 ||month==2){
            System.out.println(month + "月为冬季!");
        }else {
            System.out.println("录入错误月份！！！!");
        }



    }
}
