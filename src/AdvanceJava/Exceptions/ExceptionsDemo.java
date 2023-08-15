package AdvanceJava.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
//    public static void show()  {
//        sayHello("hi");
//    }

    public static void show(){

        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }

//        FileReader reader = null;
////        try with resources we can add 1 or more resources in try
////        try(var reader = new FileReader("file.txt");
////             var writer = new Filewriter(",,,,");
////        ){
//        try {
//            reader = new FileReader("file.txt");
//            var value = reader.read();
//            new SimpleDateFormat().parse("hi");
//            System.out.println("File opened");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException | ParseException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            if(reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
