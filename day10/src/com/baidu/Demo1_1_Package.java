/*
   A:定义包的格式
     * package 包名;
     * 多级包用.分开即可
 * B:定义包的注意事项
     * a:package语句必须是程序的第一条可执行的代码
     * b:package语句在一个java文件中只能有一个
     * c:如果没有package，默认表示无包名
 */
/*
  A:案例演示
	* 四种权限修饰符
* B:结论
*
					本类	  同一个包下(子类和无关类)	 不同包下(子类)	不同包下(无关类)
		private 	 Y
		默认			 Y		  Y
		protected	 Y		  Y						 Y
		public		 Y		  Y						 Y				Y
 */
package com.baidu;

import java.util.*;     // * 代表通配符，它会到该包下挨个匹配，匹配上就导入

import com.zhihu.Person;
import com.google.Student;

public class Demo1_1_Package {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);*/

        Person p = new Person("aspiring", 23);
        System.out.println(p.getName() + "--" + p.getAge());
        //若子类与基类不在同一包中，那么在子类中，子类实例可以访问其从基类继承而来的protected方法，而不能访问基类实例的protected方法。
        // p.print();       // 在不同包下的无关类，不允许访问，因为是projected修饰的
        p.prints();

        Student s = new Student("aspiring_stu", 18);
        System.out.println(s.getName() + "--" + s.getAge());
        s.methed();
    }
}

