package OOP;

class Persons {
    String name;
    int age;

    Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Introducing Person: ");
        System.out.println("Name:" + name + ", Age: " + age);
    }
}

class Employeee extends Persons {
    String jobTitle;

    Employeee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;

    }

    @Override
    void introduce() {
        System.out.println("Introducing Employee: ");
        System.out.println("Name: " + name + ", Age:" + age + ", Job Title: " + jobTitle);
    }

}

class Manager extends Employeee {
    String department;

    Manager(String name, int age, String jobTitle, String department) {
        super(name, age, jobTitle);
        this.department = department;
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.println("Introducing Manager: ");
        System.out.println(
                "Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle + ", Department: " + department);
    }

}

class Executive extends Manager {
    String companyCar;

    Executive(String name, int age, String jobTitle, String department) {
        super(name, age, jobTitle, department);
        this.companyCar = "BMW X5";
    }

    @Override
    void introduce() {
        System.out.println("Introducing Executive: ");
        System.out.println("Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle + ", Department: "
                + department + ", Company Car: " + companyCar);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Persons person = new Persons("Alice", 20);
        person.introduce();

        Employeee employee = new Employeee("Bob", 35, "Software Developer");
        employee.introduce();

        Manager manager = new Manager("Bob", 30, "Manager", "IT");
        manager.introduce();

        Executive executive = new Executive("Dave", 45, "Senior Executive", "Finance");
        executive.introduce();
    }

}
