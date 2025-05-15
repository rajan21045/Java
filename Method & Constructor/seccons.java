public class seccons {
    public void m (){
        System.out.println("This is a method");
    }
    public void n (){
        this.m();
        System.out.println("This is another");
    }

    public static void main(String[] args) {
        seccons h = new seccons();
        h.n();
    }
}
