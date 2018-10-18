public class Test3_1 {
    public static void main(String[] args) {
        /*
        * A:练习题
        *
                for(int x=1; x<=10; x++) {
                    if(x%3==0) {
                        //在此处填写代码
                    }
                    System.out.println(“aspiring”);
                }

                我想在控制台输出2次:“aspiring“
                我想在控制台输出7次:“aspiring“
                我想在控制台输出13次:“aspiring“
         */

        // 我想在控制台输出2次:“aspiring“
        for(int x=1; x<=10; x++) {
            if(x%3==0) {
                break;
            }
            System.out.println("aspiring");
        }
        System.out.println("----------------------------");

        // 我想在控制台输出7次:“aspiring“
        for(int x=1; x<=10; x++) {
            if(x%3==0) {
                continue;
            }
            System.out.println("aspiring");
        }
        System.out.println("----------------------------");

        // 我想在控制台输出13次:“aspiring“
        for(int x=1; x<=10; x++) {
            if(x%3==0) {
                System.out.println("aspiring");
            }
            System.out.println("aspiring");
        }
    }
}
