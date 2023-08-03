package Fundamentals;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage2 {
    public static void main(String[] args){
        final byte months_in_year = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        float rate= 0;
        int period = 0;
        float monthlyInterest =0;
        int numberOfPayments = 0;

        while (true) {
            System.out.print("Principal ($1k-$1M) : ");
            principal = scanner.nextInt();

            if (principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }
        while (true) {
            System.out.print("Please enter the value of Interest Rate here:");
            rate = scanner.nextFloat();
            if (rate >= 1 && rate <= 30){
                monthlyInterest = rate/percent/months_in_year;
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }

        while (true) {
            System.out.print("Please enter the Period (Years) of payments here:");
            period = scanner.nextInt();
            if (period >= 1 && period <= 30) {
                numberOfPayments = period * months_in_year;
                break;
            }
            System.out.println("Enter a value greater than 1 and less than or equal to 30.");
        }



        double mortgage = principal * (monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))/
                (Math.pow(1+monthlyInterest,numberOfPayments)-1);

        String finalMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.printf(String.valueOf(finalMortgage));


    }
}
