package Fundamentals;

import java.text.NumberFormat;
import java.util.Scanner;

public class UpgradedMortgage {
    final static byte months_in_year = 12;
    final static byte percent = 100;
    public static void main(String[] args){
        int principal = (int) readNumber("Principal ($1k-$1M) : ", 1000, 1000000);
        float rate = (float) readNumber("Please enter the value of Interest Rate here:", 1, 30);
        byte period = (byte) readNumber("Please enter the Period (Years) of payments here: ", 1, 30);

        printMortgage(principal, rate, period);
        printPaymnetSchedule(principal, rate, period);
    }

    private static void printMortgage(int principal, float rate, byte period) {
        double mortgage = calculateMortgage(principal, rate, period);
        String finalMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("Mortgage");
        System.out.println("---------");
        System.out.println("MONTHLY PAYMENT: " + finalMortgage);
        System.out.println("---------");
    }

    private static void printPaymnetSchedule(int principal, float rate, byte period) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE:");
        System.out.println("--------------------");
        for(short month = 1; month<= period * months_in_year; month++){
            double monthly = calculateBalance(principal, rate, period,month);
            String remainBalance = NumberFormat.getCurrencyInstance().format(monthly);
            System.out.println(remainBalance);
        }
    }

    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number between " + min +" and "+ max);
        }
        return value;
    }
    public static double calculateBalance(int principal, float rate, byte period, short numberOfPaymentsMade){
        float numberOfPayments = period * months_in_year;
        float monthlyInterest = rate/percent/months_in_year;
        double balance = principal
                *(Math.pow(1+monthlyInterest,numberOfPayments)-Math.pow(1+monthlyInterest,numberOfPaymentsMade))
                /(Math.pow(1+monthlyInterest,numberOfPayments)-1);

        return balance;
    }
    public static double calculateMortgage(int principal, float rate, byte period){
        float numberOfPayments = period * months_in_year;
        float monthlyInterest = rate/percent/months_in_year;
        double mortgage = principal * (monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))/
                (Math.pow(1+monthlyInterest,numberOfPayments)-1);

        return mortgage;
    }
}
