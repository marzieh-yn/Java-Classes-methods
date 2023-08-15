package AdvanceJava.Collections;

import java.util.*;

public class SetDemo {
  public static void show() {
    Set<String> set3 = new HashSet<>();
    Set<String> set1 =
      new HashSet<>(Arrays.asList("a", "b", "c"));

    Set<String> set2 =
      new HashSet<>(Arrays.asList("b", "c", "d"));

    System.out.println(set1);

    // Union
    set1.addAll(set2);
    System.out.println(set1);

    // Intersection items are common in both set
    set1.retainAll(set2);
    System.out.println(set1);

    // Difference
    set1.removeAll(set2);
    System.out.println(set1);

  }
}
