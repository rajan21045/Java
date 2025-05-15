// Uses of constructor
public class Student{
    String name;
    int age;
                public Student(String name, int age){
                   this.name = name;
                   this.age = age;
                }   
                public void display(){
                    System.out.println("Name: " + name + " Age: " + age);
                }
                public static void main(String[] args) {
                    Student s1 = new Student("Rajan", 20);
                    Student s2 = new Student("Shishir", 22);
                    s1.display();
                    s2.display();
                }
}
