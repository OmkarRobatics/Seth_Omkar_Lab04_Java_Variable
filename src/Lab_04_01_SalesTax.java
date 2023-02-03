public class Lab_04_01_SalesTax {
    public static void main(String[] args) {
        double purchasePrice = 20.0; // inputs the purchase price (input is not made but selected by me)
        double salesTax = purchasePrice*0.05; // finds the sales tax and stores it
        double totalPrice = purchasePrice + salesTax; // total price with sales tax is found
        System.out.println("The purchase price entered was $" + purchasePrice); // original purchase price is printed
        System.out.println("The sales tax is $" + salesTax); // the value of the sales tax is printed
        System.out.println("The total price is $" + totalPrice); // the total price including tax is printed
    }
}
