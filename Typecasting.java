public class Typecasting {

   public static void main(String[] args) {
      int n = 10;
      double d = n; // Automatic Typecasting
      int a = 12;
      byte b;
      b = (byte) a; // Manual Typecasting
            
      System.out.println("Value of b: " + b);
      System.out.println("Int value: " + n);
      System.out.println("Double value: " + d);
   }
}