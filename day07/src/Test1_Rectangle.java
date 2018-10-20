/*
 * A:案例演示
       需求：
       定义一个长方形类,定义 求周长和面积的方法，
       然后定义一个测试类进行测试。
 */
public class Test1_Rectangle {              // Rectangle 矩形
    public static void main(String[] args) {

        Rectangle ts = new Rectangle();
        ts.show();
        System.out.println("--------------------");
        Rectangle re = new Rectangle(4,5);
        re.setLength(10);
        int per = re.Perimeter();
        System.out.println("周长为：" + per);
        int ar = re.Area();
        System.out.println("面积为：" + ar);

    }
}

class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        length = 6;
        width = 6;

    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int Perimeter() {
        return (length + width) * 2;
    }

    public int Area() {
        return length * width;
    }

    public void show() {
        int per = Perimeter();
        int ar = Area();
        System.out.println("周长为：" + per + ", 面积为：" + ar);
    }
}
