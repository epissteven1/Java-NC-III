package OOP;

class Car {
    String brand;
    int year;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.year = 2021;
        myCar.displayInfo();
    }

}
