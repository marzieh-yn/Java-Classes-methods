package OOP;

public class Procedure {
    public static void main(String[] args){

//          if it was Procedure
        int baseSalary = 50000;
        int extraHour = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary, extraHour, hourlyRate);
        System.out.println(wage);
    }
    public static int calculateWage(
            int baseSalary,
            int extraHour,
            int hourlyRate
    ){
        return baseSalary + (extraHour * hourlyRate);
    }
}
