//4. Define Abstract Class.
/*
1️⃣ Abstract Class in Java
An abstract class is a class declared using the abstract keyword that cannot be instantiated and is designed to be inherited by subclasses.
It is used to achieve partial abstraction (0–100%). It can contain:
1. Abstract methods (without body)
2. Concrete methods (with body)
3. Constructors
4. Instance variables
5. Static methods
*/

public class abstraction {
    public static void main(String[] args) {

        Animal ani = new Pig();   // Polymorphism
        ani.animalSleep();
        ani.sleep();
    }
}

abstract class Animal {

    public abstract void animalSleep(); // abstract method

    public void sleep() {               // concrete method
        System.out.println("Wzzz");
    }
}

class Pig extends Animal {

    @Override
    public void animalSleep() {
        System.out.println("The pig is sleeping...");
    }
}
