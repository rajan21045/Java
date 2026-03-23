public class stringPractice {
    public static void main(String[] args){
        /*
        Java Strings
        Strings are used for storing text.
        A String variable contains a collection of characters surrounded by double quotes (""):
         */
        String msg = "Hello, How Are You?";
        System.out.println("The String Is "+ msg);

        /*
        String Length
        A String in Java is actually an object, which means it contains methods that can perform certain operations on strings.
        For example, you can find the length of a string with the length() method:
         */
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());


        /*
        More String Methods
        There are many string methods available in Java.

        For example:
        The toUpperCase() method converts a string to upper case letters.
        The toLowerCase() method converts a string to lower case letters.
         */
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt1.toLowerCase());   // Outputs "hello world"

        /*
        Finding a Character in a String
        The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
         */
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7

        //Java counts positions from zero.
        //0 is the first position in a string, 1 is the second, 2 is the third ...

        //You can use the charAt() method to access a character at a specific position in a string:

        String txt3 = "Hello";
        System.out.println(txt3.charAt(0));  // H
        System.out.println(txt3.charAt(4));  // o

        //Comparing Strings
        //To compare two strings, you can use the equals() method:

        String message1 = "Hello";
        String message2 = "Hello";

        String message3 = "Greetings";
        String message4 = "Great things";

        System.out.println(message1.equals(message2));  // true
        System.out.println(message3.equals(message4));  // false
    }
}
