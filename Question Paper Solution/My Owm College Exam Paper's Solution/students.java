public class students {
    String name;
    int age;


    public students(){
        name = "Unknown";
        age = 20;
    }

    public students(String n){
        name = n;
        age = 22;
    }

    public students(String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Name: "+name+ " And "+ "Age: "+ age);
    }

    public static void main(String[] args) {

        students st1 = new students();
        students st2 = new students("Ram");
        students st3 = new students("Shayam", 20);

        st1.display();
        st2.display();
        st3.display();

    }
}
