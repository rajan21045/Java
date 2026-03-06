/*
In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

1. subclass (child) - the class that inherits from another class
2. superclass (parent) - the class being inherited from

To inherit from a class, use the extends keyword.
*/

//In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):

class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("Brand: " + brand);
    }
}

class javaLearningInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.honk();
        car.display();
        System.out.println("Brand: " + car.brand);
    }
}
//The final Keyword
//If you don't want other classes to inherit from a class, use the final keyword.