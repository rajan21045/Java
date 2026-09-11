public class enumPractice{
    enum months{
        Jan,
        Feb,
        Mar,
        Apr,
        May,
        Jun,
        Jul,
        Aug,
        Sep,
        Oct,
        Nov,
        Dec
    }
    public static void main(String[] args) {
        int firstMonth = (int)months.Jan.ordinal();
        System.out.println("The ordinal value of January is: " + firstMonth);

        months mnth = months.Jan;
        System.out.println("The month is: " + mnth);

        //Enum in a Switch Statement
        switch(mnth){
            case Jan:
                System.out.println("The month is January");
                break;
            case Feb:
                System.out.println("The month is February");
                break;
            case Mar:
                System.out.println("The month is March");
                break;
            case Apr:
                System.out.println("The month is April");
                break;
            case May:
                System.out.println("The month is May");
                break;
            case Jun:
                System.out.println("The month is June");
                break;
            case Dec:
                System.out.println("The month is December");
                break;
        }

        //Loop Through an Enum
        //The enum type has a values() method, which returns an array of all enum constants. This method is useful when you want to loop through the constants of an enum:
        for(months myVar : months.values()){
            System.out.println(myVar);
        }

        
    }
}