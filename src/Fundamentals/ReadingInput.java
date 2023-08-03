package Fundamentals;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args){
        System.out.printf("Please enter your age:");
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println("you are " + age);
        System.out.printf("Please enter your name:");
        Scanner scanner_name = new Scanner(System.in);
        String name = scanner_name.nextLine().trim();
        System.out.println("you are " + name);
    }
}
