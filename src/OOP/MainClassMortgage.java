package OOP;

public class MainClassMortgage {
    public static void main(String[] args){
        int principal = (int) MortgageConsole.readNumber("Principal ($1k-$1M) : ", 1000, 1000000);
        float rate = (float) MortgageConsole.readNumber("Please enter the value of Interest Rate here:", 1, 30);
        byte period = (byte) MortgageConsole.readNumber("Please enter the Period (Years) of payments here: ", 1, 30);
        var calculator = new MortgageCalculator(principal,rate,period);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymnetSchedule();
    }

}
