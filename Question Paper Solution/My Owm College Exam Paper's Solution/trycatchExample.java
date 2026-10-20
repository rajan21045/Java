public class trycatchExample {
    public static void main(String[] args) {
                try{
                        int a = 10/0;
                }catch (ArithmeticException e){
                    System.out.println("Cannot Divide By Zero");
                }
    }
}