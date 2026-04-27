public class LogicalOperators {
    public static void main(String[] args) {
        /*
        Logical Operators in Conditions
        You can combine or reverse conditions using logical operators. These work together with if, else, and else if to build more complex decisions.

        && (AND) - all conditions must be true
        || (OR) - at least one condition must be true
        ! (NOT) - reverses a condition (true = false, false = true)
        */

        /*
        AND (&&)
        Use AND (&&) when both conditions must be true:
        */
        int num1 = 15;
        int num2 = 13;
        boolean isHero = true;

        if (num1 > num2 && isHero) {
            System.out.println("Both conditions are true");
        }

        /*
        OR (||)
        Use OR (||) when at least one of the conditions can be true:

        Example
        Test if a is greater than b, or if a is greater than c:
        */
        int a = 200;
        int b = 33;
        int c = 500;

        if (a > b || a > c) {
        System.out.println("At least one condition is true");
        }
        /*
        NOT (!)
        Use NOT (!) to reverse a condition:

        Example
        Test if a is not greater than b:

        */
        int a1 = 33;
        int b1 = 200;

        if (!(a1 > b1)) {
        System.out.println("a1 is NOT greater than b1");
        }

        /*    
        Real-Life Example
        In real programs, logical operators are often used for access control. For example, to get access to a system, there are specific requirements:

        You must be logged in, and then you either need to be an admin, or have a high security clearance (level 1 or 2):

        Example
        */
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 1 = highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
        System.out.println("Access granted");
        } else {
        System.out.println("Access denied");
        }

        // Try changing securityLevel to test different outcomes:
        //
        // securityLevel 1 = Access granted
        // securityLevel 2 = Access granted
        // securityLevel 3 = Access denied
        // securityLevel 4 = Access denied
        //
        // If isAdmin = true, access is granted.
    }
}
