package OOP;

public class Employee {
//    instance members these 2 line
    private int baseSalary;
    private int hourlyRate;

//    static members
    private static int numberOfEmployees;

//    using constructor
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

//    static method
    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }

//    for who do not have extra hour
    public Employee(int baseSalary){
        this(baseSalary,0);
//        or
//        setBaseSalary(baseSalary);
//        setHourlyRate(0);
    }

    public int calculateWage(int extraHour){

        return baseSalary + (extraHour * getHourlyRate());
    }

    //    for who do not have extra hour
    public int calculateWage(){
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary can not be 0 or less than 0");
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate < 0)
            throw new IllegalArgumentException("Hourly Rate can not be less than 0 or equal with 0");
        this.hourlyRate = hourlyRate;
    }
}
