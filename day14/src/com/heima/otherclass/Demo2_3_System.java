package com.heima.otherclass;
/*
 * * A:System��ĸ���
 * System �����һЩ���õ����ֶκͷ����������ܱ�ʵ������
 * B:��Ա����
 * public static void gc()
 * public static void exit(int status)
 * public static long currentTimeMillis()
 * pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 * C:������ʾ
 * System��ĳ�Ա����ʹ��
 */
public class Demo2_3_System {
    public static void main(String[] args) {
        // demo1();
        // demo2();
        // demo3();
        int[] src = {11,22,33,44,55};
        int[] dest = new int[8];
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
        System.out.println("--------");
        System.arraycopy(src,0,dest,0,src.length-1);    // ���������ݿ���
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
    }

    public static void demo3() {
        long start = System.currentTimeMillis();    // ��ȡ��ǰʱ��ĺ���ֵ
        for (int i = 0; i < 1000; i++) {
            System.out.println("*");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void demo2() {
        System.exit(0);     // ��0״̬���쳣��ֹ���˳�jvm
        System.out.println("�˳�jvm");
    }

    public static void demo1() {
        for (int i = 0; i < 100; i++) {
            new Demo();
            System.gc();

        }
    }
}
class Demo{     // ��һ��Դ�ļ��в�������������public���ε���
    public void finalize(){
        System.out.println("��������ɨ��");
    }
}