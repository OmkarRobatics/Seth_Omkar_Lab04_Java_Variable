public class Lab_04_03_MonthlyCCBalance {
    public static void main(String[] args) {
        int creditCardBalance = 5000; // inputs credit card balance (5000 is already set so no input is taken)
        double oneMonthInterest = creditCardBalance*0.17; // calculates interest for one month
        double oneMonthCreditCardBalance = creditCardBalance + oneMonthInterest; // finds new balance
        double twoMonthInterest = oneMonthCreditCardBalance*0.17; // calculates interest for two months
        System.out.println("The interest due after one month is $" + oneMonthInterest); // outputs interest for 1 month
        System.out.println("The interest due after two months is $" + twoMonthInterest); // outputs interest for 2 months

    }
}
