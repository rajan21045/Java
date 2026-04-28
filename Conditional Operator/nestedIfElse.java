class nestedIfElse {
    public static void main(String[] args) {
        int age = 20;
        boolean isCitizen = true;
 
        if (age >= 18) {
            System.out.println("Old Enough To Vote");
            if (isCitizen) {
                System.out.println("And you are a citizen, so you can vote!");
            } else {
                System.out.println("But you must be a citizen to vote.");
            }
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}