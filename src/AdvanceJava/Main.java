package AdvanceJava;

import AdvanceJava.Collections.*;
import AdvanceJava.Exceptions.ExceptionsDemo;
import AdvanceJava.Generics.*;

import java.io.IOException;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (Throwable e) {
            System.out.println("An Expected error occurred");
        }
        System.out.println("**********************");
//      Generics
        var list = new GenericList<Integer>();
        list.add(10); // boxing
        int number = list.getItems(0); // unboxing
        System.out.println(number);
        System.out.println("**********************");
//      User
        var user1 = new User(20);
        var user2 = new User(15);
        if (user1.compareTo(user2) > 0)
            System.out.println("user1 is more that user2");
        else if (user1.compareTo(user2) == 0)
            System.out.println("user1 = user2");
        else
            System.out.println("user1 is less than user2");
        System.out.println("**********************");
//      Utils
        var max= Utils.max(22,15);
        System.out.println(max);
        var max1 = Utils.max(new User(10), new User(20));
        System.out.println(max1);
        Utils.print("Hi",10);
        System.out.println("**********************");
        User user = new Instructor(10);
        var instructor = new GenericList<Instructor>();
        var users = new GenericList<User>();
        Utils.printUsers(users);

//        Wildcard
        Utils.printUser(instructor);
        Utils.printUser(users);
        System.out.println("**********************");

        var lists = new GenericList<String>();
//        lists.items[0] = "x";
//        System.out.println(lists.items.length);

//        Iterable
        var iterable = lists.iterator();
        while (iterable.hasNext()){
            var current = iterable.next();
            System.out.println(current);
        }

//        or
        lists.add("a");
        lists.add("b");
        lists.add("n");
        for (var item: lists)
            System.out.println(item);
        System.out.println("**********************");
//      collection demo
        CollectionDemo.show();
        System.out.println("**********************");

//        List demo
        ListDemo.showList();
        System.out.println("**********************");

//         Customer
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b","A1@gmail.com"));
        customers.add(new Customer("a","A3@gmail.com"));
        customers.add(new Customer("c","A2@gmail.com"));
        Collections.sort(customers);
        System.out.println(customers);
        Collections.sort(customers, new EmailComparator());

        System.out.println(customers);
        System.out.println("**********************");
//        queue
        QueueDemo.show();
        System.out.println("**********************");

//        Set
        SetDemo.show();

//      Maps

    }
}