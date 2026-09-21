public class Main {

    public static void main(String[] args) {

        // ---------- Part 1a: int variables ----------
        int intOperandA = 13;
        int intOperandB = 5;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        // ---------- Part 1a: double variables ----------
        double doubleOperandA = 13.50;
        double doubleOperandB = 5.25;
        double doubleSum = 0.0;
        double doubleProduct = 0.0;
        double doubleDifference = 0.0;
        double doubleQuotient = 0.0;

        // ---------- int arithmetic ----------
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        System.out.println();

        // ---------- double arithmetic ----------
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        System.out.println();

        // ---------- Part 1b: meaningful variables of each type ----------
        double myLunchCost = 12.50;
        int numberOfKidsInFamily = 3;
        boolean isItRaining = false;
        double gasPricePerGallon = 3.19;
        int myFavoriteNumber = 7;
        double myShoeSize = 10.5;
        String myBirthMonth = "March";
        String myFullName = "Your Name Here";

        System.out.println("The cost of my lunch is: " + myLunchCost);
        System.out.println("The number of kids in my family is: " + numberOfKidsInFamily);
        System.out.println("Is it raining? " + isItRaining);
        System.out.println("The price of a gallon of gas is: " + gasPricePerGallon);
        System.out.println("My favorite number is: " + myFavoriteNumber);
        System.out.println("My shoe size is: " + myShoeSize);
        System.out.println("My birth month is: " + myBirthMonth);
        System.out.println("My full name is: " + myFullName);
    }
}
