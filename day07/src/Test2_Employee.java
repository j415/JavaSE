/*
 * A:案例演示
       需求：定义一个员工类Employee
       自己分析出几个成员，然后给出成员变量
       姓名name,工号id,工资salary
       构造方法，
       空参和有参的
       getXxx()setXxx()方法，
       以及一个显示所有成员信息的方法。并测试。
       work
 */
public class Test2_Employee {               // employee 员工
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("aspiring");
        emp1.setId("001");
        emp1.setSalary(5000);
        emp1.work();
        System.out.println("--------------------");
        Employee emp2 = new Employee("aspiring02", "002", 8000);
        System.out.println("姓名:" + emp2.getName() + ", id:" + emp2.getId() + ", 工资:" + emp2.getSalary());

    }
}

class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void work() {
        System.out.println("员工姓名:" + name + ", 员工id:" + id + ", 员工工资$:" + salary);
    }

}
