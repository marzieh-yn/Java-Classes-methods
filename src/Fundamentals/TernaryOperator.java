package Fundamentals;

public class TernaryOperator {
    public static void main(String[] args){
        int income = 90_000;
        String classIncome = income < 100_000 ? "Economy" : "First";

        System.out.println(classIncome);
    }
}
