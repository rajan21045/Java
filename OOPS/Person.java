public class Person{
    private String name;

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setName("Rajan Poudel");
        System.out.println("My Name Is " + obj.getName());
    }
}
