package com.heima.object;

import com.heima.bean.Student;

public class Demo1_HashCode {
    public static void main(String[] args) {
        Object obj1 = new Object();
        int hashcode = obj1.hashCode();
        System.out.println(hashcode);

        Student s1 = new Student("aspiring01",13);
        Student s2 = new Student("aspiring02",24);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


    }
}
