//Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

public class javaLearningPolymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myDog = new Dog(); // Create a Dog object
        Animal myPig = new Pig(); // Create a Pig object

        myAnimal.makeSound();
        myDog.makeSound();
        myPig.makeSound();
    }
}

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Pig extends Animal {
    public void makeSound() {
        System.out.println("The pig oinks");
    }
}
/* 
Why And When To Use "Inheritance" and "Polymorphism"?
- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
*/