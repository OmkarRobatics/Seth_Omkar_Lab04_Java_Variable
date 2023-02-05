public class Lab_04_Variables {
    public static void main(String[] args) {
        int intOperandA = 1; //This is a declaration and initial assignment of an integer variable (I have selected a number instead of taking an input)
        int intOperandB = 5; //This is a declaration and initial assignment of an integer variable (I have selected a number instead of taking an input)
        int intSum = 13; //This is a declaration and initial assignment of an integer variable
        int intProduct = 3; //This is a declaration and initial assignment of an integer variable
        int intDifference = 6; //This is a declaration and initial assignment of an integer variable
        int intQuotient = 7; //This is a declaration and initial assignment of an integer variable
        int intModulo = 4; //This is a declaration and initial assignment of an integer variable
        double doubleOperandA = 1.1; //This is a declaration and initial assignment of a double variable (I have selected a number instead of taking an input)
        double doubleOperandB = 5.2; //This is a declaration and initial assignment of a double variable (I have selected a number instead of taking an input)
        double doubleSum = 13.3; //This is a declaration and initial assignment of a double variable
        double doubleProduct = 3.4; //This is a declaration and initial assignment of a double variable
        double doubleDifference = 6.5; //This is a declaration and initial assignment of a double variable
        double doubleQuotient = 7.6; //This is a declaration and initial assignment of a double variable

        intSum = intOperandA + intOperandB; // adds the values in intOperandA and intOperandB and stores this value in intSum
        System.out.println("The integer sum of " + intOperandA + " and " + intOperandB + " is " + intSum); // outputs the value in intSum
        intProduct = intOperandA * intOperandB; // multiplies the values in intOperandA and intOperandB and stores this value in intProduct
        System.out.println("The integer product of " + intOperandA + " and " + intOperandB + " is " + intProduct); // outputs the value of intProduct
        intDifference = intOperandA - intOperandB; // subtracts the values in intOperandA and intOperandB and stores this value in intDifference
        System.out.println("The integer difference of " + intOperandA + " and " + intOperandB + " is " + intDifference); // outputs the value of intDifference
        intQuotient = intOperandA / intOperandB; // divides the values in intOperandA and intOperandB and stores this value in intQuotient
        System.out.println("The integer quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient); // outputs the value of intQuotient
        intModulo = intOperandA % intOperandB; // divides the value of intOperandA and intOperandB and stores the remainder in intModulo
        System.out.println("The integer modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo); // outputs the value of intModulo
        doubleSum = doubleOperandA + doubleOperandB; // adds the value in doubleOperandA and doubleOperandB and stores this value in doubleSum
        System.out.println("The double sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum); // outputs the value of doubleSum
        doubleProduct = doubleOperandA * doubleOperandB; // multiplies the value in doubleOperandA and doubleOperandB and stores this value in doubleProduct
        System.out.println( "The double product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct); // outputs the value of doubleProduct
        doubleDifference = doubleOperandA - doubleOperandB; // subtracts the value in doubleOperandA and doubleOperandB and stores this value in doubleDifference
        System.out.println("The double difference of " + doubleOperandA + " and " + doubleOperandB + " is "  + doubleDifference); // outputs the value of doubleDifference
        doubleQuotient = doubleOperandA / doubleOperandB; // divides the value in doubleOperandA and doubleOperandB and stores this value in doubleQuotient
        System.out.println("The double quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient); // outputs the value of doubleQuotient




    }
}