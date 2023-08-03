package Fundamentals;

public class LogicOperator {
    public static void main(String[] args){
        int temperature = 15;
        boolean itIsWarm = temperature >20 && temperature<30;
        System.out.println(itIsWarm);
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean eligible = (hasGoodCredit || hasHighIncome) && !hasCriminalRecord;
        System.out.println(eligible);
    }
}
