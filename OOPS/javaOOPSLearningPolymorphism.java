// File name: PolymorphismDemo.java

public class javaOOPSLearningPolymorphism {
    public static void main(String[] args) {
        
        // --- Compile-time polymorphism (Method Overloading) ---
        System.out.println("Sum of integers: " + Adder.add(5, 10));
        System.out.println("Sum of doubles: " + Adder.add(5.5, 10.5));

        // --- Run-time polymorphism (Method Overriding) ---
        Animal myAnimal = new Animal(); // reference = Animal, object = Animal
        Animal myDog = new Dog();       // reference = Animal, object = Dog
        Animal myCat = new Cat();       // reference = Animal, object = Cat

        myAnimal.sound(); // Calls Animal's method
        myDog.sound();    // Calls Dog's overridden method
        myCat.sound();    // Calls Cat's overridden method
    }
}

// Compile-time polymorphism (Method Overloading)
class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

// Run-time polymorphism (Method Overriding)
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
