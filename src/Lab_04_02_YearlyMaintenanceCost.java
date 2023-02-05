public class Lab_04_02_YearlyMaintenanceCost {
    public static void main(String[] args) {
        double springMaintenanceCost = 100.0; // inputs spring maintenance cost (the input is not made but a number is selected by me)
        double summerMaintenanceCost = 80.0; // inputs summer maintenance cost (the input is not made but a number is selected by me)
        double fallMaintenanceCost = 120.0; // inputs fall maintenance cost (the input is not made but a number is selected by me)
        double winterMaintenanceCost = 150.0; // inputs winter maintenance cost (the input is not made but a number is selected by me)
        double yearlyMaintenanceCost = springMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost; // The maintenance cost for all 4 seasons is added to determine the yearly maintenance cost. This number is then stored in the variable.
        System.out.println("The yearly maintenance cost is $" + yearlyMaintenanceCost); // The total yearly maintenance cost is printed

    }
}
