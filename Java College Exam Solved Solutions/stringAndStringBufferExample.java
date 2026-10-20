public class stringAndStringBufferExample {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println(".............Example of String Modify.............");

        String str = "Rajan ";
        System.out.println("The Length of String(str) Is " +str.length());

        String str2 = " Prabin ";
        System.out.println("Example Of Cancat Is "+ str.concat(str2));

        System.out.println("Before Converting To Uppercase of String(str) Is "+str+" " +"And After Converting To UpperCase Is "+str.toUpperCase());

        System.out.println("Before Converting To LowerCase of String(str) Is "+str+" " +"And After Converting To LowerCase Is "+str.toLowerCase());

        String s1 = " Hello";
        System.out.println("Before Replacing characters(s1) Is "+s1 + " "+"And After Replacing Is "+ s1.replace('l', 'x'));

        System.out.println("Before SubString Is "+ s1 +" "+" And After SubString Is "+s1.substring(1,4));

        System.out.println(" ");
        System.out.println(".............Example of String Buffer.............");

        StringBuffer sb1 = new StringBuffer("Hello");

        System.out.println(sb1.append(" World"));

        System.out.println( sb1.insert(5, " Java"));

        System.out.println(sb1.replace(6, 10, "C++"));

        System.out.println(sb1.delete(5, 9));

        System.out.println(sb1.reverse());
    }
}

/*
In Java, both String and StringBuffer are used to handle text, but they differ significantly in how they manage and modify data. A String is immutable,
meaning once it's created, its value cannot be changed. Any operation that appears to modify a String, such as concatenation or replacement, actually
creates a new String object in memory. This makes String suitable for situations where the text content remains constant or changes rarely, such as
storing names, labels, or constant messages. On the other hand, StringBuffer is mutable, meaning you can change its content without creating a new object.
It provides various methods like append(), insert(), replace(), delete(), and reverse() to efficiently manipulate strings. Because of this, StringBuffer
is preferred when frequent modifications are required, especially inside loops or large-scale text processing. Another important distinction is that
StringBuffer is thread-safe, meaning its methods are synchronized and can be safely used in multi-threaded environments, whereas String achieves thread
safety through immutability. However, the thread-safety in StringBuffer adds slight overhead, so if synchronization isn’t necessary, StringBuilder is
an even faster alternative. In summary, String is ideal for fixed or rarely-changing text, while StringBuffer is better for dynamic and frequently
changing string operations.
 */