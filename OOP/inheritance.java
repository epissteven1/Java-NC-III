package OOP;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Studentss extends Person {
    int grade;

    Studentss(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayGrade() {
        // System.out.println("Grade: " + grade);
        if (grade >= 90) {
            System.out.println("Grader: A");
        } else if (grade >= 80) {
            System.out.println("Grader: B");
        } else if (grade >= 70) {
            System.out.println("Average");
        } else {
            System.out.println("Needs Improvement");
        }
    }
}

public class inheritance {
    public static void main(String[] args) {
        Studentss student = new Studentss("Alice ", 20, 90);
        student.displayInfo();
        student.displayGrade();
    }
}
