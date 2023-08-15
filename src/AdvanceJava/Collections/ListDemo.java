package AdvanceJava.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void showList(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        // Add an item at a given index
        list.add(0, "!");
        System.out.println(list);

        // We can add multiple items in one go
        Collections.addAll(list, "a", "b", "c");

        var first = list.get(0);
        System.out.println(first);
        list.set(0, "!!");
        System.out.println(list);

        list.remove(0);

        var index = list.indexOf("a");
        System.out.println(index);
        var lastIndex = list.lastIndexOf("a");
        System.out.println(lastIndex);

        System.out.println(list.subList(0, 2));


    }
}
