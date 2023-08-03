package Fundamentals;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args){
        final byte months_in_year = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the value of your loan:");
        int loan = scanner.nextInt();

        System.out.print("Please enter the value of Interest Rate here:");
        float rate = scanner.nextFloat();

        System.out.print("Please enter the Period (Years) of payments here:");
        int period = scanner.nextInt();
        float monthlyInterest = rate/percent/months_in_year;

        int numberOfPayments = period * months_in_year;

        double mortgage = loan * (monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))/
                (Math.pow(1+monthlyInterest,numberOfPayments)-1);
        
        String finalMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.printf(String.valueOf(finalMortgage));


    }
}
