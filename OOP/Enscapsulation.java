package OOP;

class StudentSNE {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        if (age < 0) {
            System.out.println("Invalid age");
            return 0;
        }
        return age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

public class Enscapsulation {

    public static void main(String[] args) {
        StudentSNE student1 = new StudentSNE();
        student1.setName("John Doe");
        student1.setAge(20);
        student1.displayInfo();
    }
}
