public class Lab_04_04_EvenOdd {
    public static void main(String[] args) {
        //variables
        int integerInput = 7; // inputs integer (I have selected an input instead of taking one)

        //conditions
        if (integerInput % 2 == 0) // tests if the number divided by two has a remainder
             {
            System.out.println("The number entered is even"); // outputs "even" if condition is true
        } else {
            System.out.println("The number entered is odd"); // outputs "odd" if condition is false
        }
    }
}


