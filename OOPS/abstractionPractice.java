public class abstractionPractice {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.makeSound();
        dg.sleep();
    }
}
abstract class Animal{
    public abstract void makeSound();
    public void sleep(){
        System.out.println("Animal Can Sleep In The Night Like Human.");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Hi, I Am Pet Dog.");
    }
}