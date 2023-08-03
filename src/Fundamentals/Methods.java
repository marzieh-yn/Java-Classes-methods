package Fundamentals;

public class Methods {
    public static void main(String[] args){
       String msg =  greetUser("Niloofar" , "Yn");
        System.out.println(msg);

    }
    public static String greetUser(String firstName, String lastName){
      return  "Hello " + firstName + " " + lastName;
    }
}
