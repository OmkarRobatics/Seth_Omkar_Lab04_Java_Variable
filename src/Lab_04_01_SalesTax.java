public class Lab_04_01_SalesTax {
    public static void main(String[] args) {
        double purchasePrice = 20.0;
        double salesTax = purchasePrice*0.05;
        double totalPrice = purchasePrice + salesTax;
        System.out.println("The purchase price entered was $" + purchasePrice);
        System.out.println("The sales tax is $" + salesTax);
        System.out.println("The total price is $" + totalPrice);
    }
}
