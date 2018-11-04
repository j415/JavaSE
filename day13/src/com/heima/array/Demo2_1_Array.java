/*
   A:������ʾ
     * ����߼�ð���������
 */
package com.heima.array;

public class Demo2_1_Array {
    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 78, 90};
        bubbleSort(arr);
        selectSort(arr);

    }

    /*
	 * ð������
	 * 1,����ֵ����,void
	 * 2,�����б�,int[] arr
	 *
	 * 	��һ��:arr[0]��arr[1],arr[1]��arr[2],arr[2]��arr[3],arr[3]��arr[4]�Ƚ�4��
		�ڶ���:arr[0]��arr[1],arr[1]��arr[2],arr[2]��arr[3]�Ƚ�3��
		������:arr[0]��arr[1],arr[1]��arr[2]�Ƚ�2��
		���Ĵ�:arr[0]��arr[1]�Ƚ�1��
	 */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {              // ��ѭ��ֻ��Ҫ�Ƚ�arr.length-1�μ���
            for (int j = 0; j < arr.length - i-1; j++) {        // - 1 ��Ϊ�˷�ֹ����Խ�磬- i��Ϊ�����Ч��
                if (arr[j] > arr[j + 1]) {
                    /*int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;*/
                    swap(arr,j,j+1);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    /*int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;*/
                    swap(arr,i,j);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    /*
     * ��λ����
     * 1,����ֵ����,void
     * 2,�����б�int[] arr.int i,int j
     *
     * ���ĳ������,ֻ��Ա���ʹ��,������������ʹ�þͿ��Զ����˽�е�
     */

    private static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
