package OOP;

public class MortgageCalculator {
    private final static byte months_in_year = 12;
    private final static byte percent = 100;

    private int principal;
    private float rate;
    private byte period;

    public MortgageCalculator(int principal, float rate, byte period) {
        this.principal = principal;
        this.rate = rate;
        this.period = period;
    }
    public double calculateBalance(short numberOfPaymentsMade) {
        int numberOfPayments = getNumberOfPayments();
        float monthlyInterest = getMonthlyInterest();
        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }
    public double calculateMortgage(){
        int numberOfPayments = getNumberOfPayments();
        float monthlyInterest = getMonthlyInterest();
        double mortgage = principal * (monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))/
                (Math.pow(1+monthlyInterest,numberOfPayments)-1);
        return mortgage;
    }
//we want to return array so we use []
    public double[] getRemainBalances(){
//        we need an array to store the remain balances
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month-1]= calculateBalance(month);

        return balances;
    }
    private float getMonthlyInterest() {
        return rate / percent / months_in_year;
    }

    private int getNumberOfPayments(){
        return period * months_in_year;
    }
}
