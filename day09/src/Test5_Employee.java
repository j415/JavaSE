/*
   A:案例演示
     * 假如我们在开发一个系统时需要对程序员类进行设计，程序员包含3个属性：姓名、工号以及工资。
     * 经理，除了含有程序员的属性外，另为还有一个奖金属性。
     * 请使用继承的思想设计出程序员类和经理类。要求类中提供必要的方法进行属性访问。
 */
public class Test5_Employee {
    public static void main(String[] args) {
        Programmer p = new Programmer("aspiring01", "asp01", 4000.0);
        p.work();
        Manager m = new Manager("aspiring00","asp00",9000.0,3000);
//        m.setName();
//        m.setId();
//        m.setsalary(9000.0);
        m.work();

    }
}

abstract class Employee {
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

    public void setsalary(double salary) {
        this.salary = salary;
    }

    public double getsalary() {
        return salary;
    }

    public abstract void work();
}
// 程序员
class Programmer extends Employee {
    public Programmer() {
    }

    public Programmer(String name, String id, double salary) {
        super(name, id, salary);
    }

    public void work() {
        System.out.println("姓名：" + this.getName() + ",工号：" + this.getId() + ",工薪：" + this.getsalary());
    }
}
// 经理
class Manager extends Employee {
    private int bonus;          // 奖金
    public Manager() {
    }

    public Manager(String name, String id, double salary,int bonus) {
        super(name, id, salary);
        this.bonus =bonus;
    }

    public void work() {
        System.out.println("姓名：" + this.getName() + ",工号：" + this.getId() + ",工薪：" + this.getsalary()+",我的奖金是："+bonus);
    }
}

