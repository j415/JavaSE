/*
  A:������ʾ
	* ���󣺰�һ���ַ���������ĸת�ɴ�д������ΪСд��(ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)
	* ��ʽ��̣�ֻҪ��֤ÿ�ε����귽�����ص��Ƕ��󣬾Ϳ��Լ�������
 */
package com.heima.test;

public class Test4 {
    public static void main(String[] args) {
        String s = "aJjkJKjHhUHUhjj";
        // ��1   ����ʦ
        String s1 = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
        System.out.println(s1);
        // ��2   �Լ�˼��
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                System.out.print(s.substring(i, i + 1).toUpperCase());
            } else {
                System.out.print(s.substring(i, i + 1).toLowerCase());
            }
        }

    }
}
