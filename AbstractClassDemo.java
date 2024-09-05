
abstract class Shape {

    public abstract void calculateArea();
}

class Circle extends Shape {

    private int x, y;
    private int radius;

    public Circle() {
        x = 5;
        y = 5;
        radius = 10;
    }

    public void calculateArea() {
        double area = 3.14 * (radius * radius);
        System.out.println("Area: " + area);
    }
}

public class AbstractClassDemo {

    public static void main(String[] args) {
        Shape s = null;
        s = new Circle();
        s.calculateArea();
        Circle s1 = new Circle();
        s1.calculateArea();
    }
}
