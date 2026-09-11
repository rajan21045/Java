public class enumConstructor{
    enum Level{
        // Enum constants (each has its own description)
        LOW("Low Level"),
        MEDIUM("Medium Level"),
        HIGH("High Level");

        // Field (variable) to store the description text
        private String description;

        // Constructor (runs once for each constant above)
        private Level(String description){
            this.description = description;
        }

        // Getter method to read the description
        public String getDescription(){
            return description;
        }
    }
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM; // Pick one enum constant
        System.out.println(myVar.getDescription()); // Prints "Medium level"
        // Note: The constructor for an enum must be private. If you don't write private, Java adds it automatically.

        //Loop Through Enum with Constructor
        // You can also loop through the constants and print their values using the values() method:
        System.out.println();
        System.out.println("Loop Through Enum with Constructor");
        for(Level myVal: Level.values()){
            System.out.println(myVal+ ": "+ myVal.getDescription());
        }
    }
}