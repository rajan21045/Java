// Main class to demonstrate OOP concepts in Java
public class javaOOPSLearningFirst {
    public static void main(String[] args){
        // Creating first Pen object
        Pen p1 = new Pen();
        p1.color = "Red";
        p1.type = "ball pen";
        p1.write();

        // Creating second Pen object
        Pen p2 = new Pen();
        p2.color = "Blue";
        p2.type = "gel pen";
        p2.write();

        // Printing colors of pens
        p1.printColor();
        p2.printColor();

        // Creating first Student object
        Student s1 = new Student();
        s1.name = "Rajan";
        s1.age = 21;
        s1.printInfo();

        // Creating second Student object using copy constructor
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}

// Pen class with properties and methods
class Pen {
    String color; // Color of the pen
    String type;  // Type of the pen

    // Method to simulate writing
    public void write() {
        System.out.println("Writing Something");
    }

    // Method to print the color of the pen
    public void printColor() {
        System.out.println(this.color);
    }

    // Default constructor
    Pen(){
        System.out.println("This is a constructor called by pen class.");
    }
}

// Student class with properties and methods
class Student {
    String name; // Name of the student
    int age;     // Age of the student

    // Method to print student information
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Default constructor
    Student(){
    }

    // Copy constructor to copy values from another Student object
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}