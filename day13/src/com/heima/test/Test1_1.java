/*
   ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
 *
     ������
         int[] arr = {1,2,3};
     ��������
         "[1, 2, 3]"

 ��StringBuffer�Ĺ���ʵ��
 */
package com.heima.test;

public class Test1_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = array2String(arr);
        System.out.println(s);

    }
    /*
     * ������ת��Ϊ�ַ���
     * 1,����ֵ����String
     * 2,�����б�int[]
     *
     * arrayToString ������ת��Ϊ�ַ���
     * array2String		2��to�ķ���һ������2�滻��to,�����ݱ����һ����дϰ��
     * dom4j  domForJ
     */
    private static String array2String(int[] arr){
        StringBuffer sb = new StringBuffer();           // �����ַ���������
        sb = sb.append("[");                            // ��[��ӵ�������

        for (int i = 0; i < arr.length-1; i++) {
            if (i != arr.length){
                sb.append(arr[i]);
                sb.append(",");
            }else{
                sb.append(arr[i]);
                sb.append("]");
            }
        }
        return sb.toString();
    }
}
