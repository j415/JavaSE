/* A:Ϊʲô���л������Ͱ�װ��
			* �������������ͷ�װ�ɶ���ĺô����ڿ����ڶ����ж������Ĺ��ܷ������������ݡ�
		* B:���ò���
			* ���õĲ���֮һ�����ڻ��������������ַ���֮���ת����
		* C:�������ͺͰ�װ��Ķ�Ӧ
		*
				byte 			Byte
				short			Short
				int				Integer
				long			Long
				float			Float
				double			Double
				char			Character
				boolean			Boolean
	 */
package com.heima.wrapclass;

public class Demo3_1_Integer {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(60));
        System.out.println(Integer.toOctalString(60));
        System.out.println(Integer.toHexString(60));

    }
}
