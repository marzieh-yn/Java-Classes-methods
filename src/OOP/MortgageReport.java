package OOP;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currencyInstance;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currencyInstance = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String finalMortgage = currencyInstance.format(mortgage);
        System.out.println();
        System.out.println("Mortgage");
        System.out.println("---------");
        System.out.println("MONTHLY PAYMENT: " + finalMortgage);
        System.out.println("---------");
    }

    public void printPaymnetSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE:");
        System.out.println("--------------------");
        for(double monthlyBalance : calculator.getRemainBalances()){
            System.out.println(currencyInstance.format(monthlyBalance));
        }
    }
}
