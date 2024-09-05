
interface Printable {

    public void print();
}

class Student implements Printable {

    private String name;
    private String address;

    Student(String n, String add) {
        name = n;
        address = add;
    }

    public void print() {

        System.out.println("name: " + name + ", address: " + address);
    }
}

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

        Student s2 = new Student("Shoaib", "Vanloese");
        s2.print();

    }

}
