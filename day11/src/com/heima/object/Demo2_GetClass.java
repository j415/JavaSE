package com.heima.object;

import com.heima.bean.Student;

public class Demo2_GetClass {
    public static void main(String[] args) {
        Student s = new Student("aspiring",12);
        Class clazz = s.getClass();             // 获取该对象的字节码文件
        String name = clazz.getName();          // 获取名称
        System.out.println(name);

    }
}
