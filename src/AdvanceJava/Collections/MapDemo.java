package AdvanceJava.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  public static void show() {
    var c1 = new Customer("a", "e1");
    var c2 = new Customer("b", "e2");

//    Java : Map
//    Python , C# : Dictionary
//    Java Scripts : Objects
    Map<String, Customer> map = new HashMap<>();
    map.put(c1.getEmail(), c1);
    map.put(c2.getEmail(), c2);

    var exists = map.containsKey("e1");
    System.out.println(exists);

    var unknown = new Customer("Unknown", "");
    var customer = map.get("e1");
    System.out.println(customer);
    customer = map.getOrDefault("e10", unknown);
    System.out.println(customer);

    map.replace("e1", new Customer("a++", "e1"));
    System.out.println(map);

//    this returns a list of keys
    for (var key : map.keySet())
      System.out.println(key);

//    this returns a list of values
    for (var value : map.values())
      System.out.println(value);

//    this returns the entry each key and value
    for (var entry : map.entrySet())
      System.out.println(entry);
  }
}
