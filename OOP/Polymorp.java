package OOP;

interface Shape {
    void area();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Polymorp {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle(5);
        shape.area();

        shape = new Rectangle(10, 5);
        shape.area();
    }
}
