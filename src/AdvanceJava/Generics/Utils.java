package AdvanceJava.Generics;

import javax.swing.*;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second){
        return (first.compareTo(second) < 0) ? second : first;
    }
    public static <K, V> void print(K key, V value){
        System.out.println(key + "=" + value);
    }
    public static void printUser(User user){
        System.out.println(user);
    }
    public static void printUsers(GenericList<User>  user){
        System.out.println(user);
    }
//    Wildcard
//    if we want to read from this list wes should use extends keyword . if we want to add to it, we should use super keyword
//    we can use read in super keyword only using object to store it
//    Read
    public static void printUser(GenericList<? extends User>  users){
        GenericList<Object> temp = new GenericList<>();
        Object x = users.getItems(0);
        User y = users.getItems(0);
    }
    public static void addUsers(GenericList<? super User>  user){
        GenericList<Object> temps = new GenericList<>();
        user.add(new Instructor(1));
        Object x = user.getItems(0);

    }
}
