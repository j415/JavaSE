/*
   A:������ʾ
     * ����߼����ֲ��Ҵ���
 * B:ע������
     * ����������򣬾Ͳ���ʹ�ö��ֲ��ҡ�
     * ��Ϊ����������ˣ������������ʱ���Ѿ��ı�������ԭʼ��Ԫ��������

 */
package com.heima.array;

public class Demo2_2_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(getIndex(arr, 9));
        System.out.println(getIndex(arr, 3));
        System.out.println(getIndex(arr, 0));

    }

    public static int getIndex(int[] arr, int value) {
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;

        while (value != arr[mid]) {                  // ���м�ֵ������Ҫ�ҵ�ֵ���Ϳ�ʼѭ������
            if (arr[mid] > value) {             // ���м�ֵ����Ҫ�ҵ�ֵ
                max = mid - 1;                  // ���������ı�
            } else if (arr[mid] < value) {      // ���м�ֵС��Ҫ�ҵ�ֵ
                min = mid + 1;                  // ��С�������ı�
            }
            mid = (min + max) / 2;  // �����������С�����ı䣬�м�����������֮�ı�

            if (min > max) {        // �����С�������������������û�в��ҵı�Ҫ��
                return -1;          // ����-1
            }
        }
        return mid;
    }
}
