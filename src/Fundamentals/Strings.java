package Fundamentals;

public class Strings
{
    public static void main(String[] args) {
        String welcome = "Hello Nili!" + " !!!";
        System.out.println(welcome);
        System.out.println(welcome.endsWith("!!"));
        System.out.println(welcome.startsWith("!!"));
        System.out.println(welcome.length());
        System.out.println(welcome.toUpperCase());
        System.out.println(welcome.indexOf("N"));
        System.out.println(welcome.indexOf("H"));
        System.out.println(welcome.indexOf("Z"));
        System.out.println(welcome.replace("!","~"));
        System.out.println("Hello \"Nillo\"");
        System.out.println("C:\\Windows\\..");
        System.out.println("Hello Niloo in \nnew line");
        System.out.println("Hello Niloo in \tnew line");

    }
}
