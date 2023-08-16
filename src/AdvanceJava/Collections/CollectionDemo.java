package AdvanceJava.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        // Add multiple items in one go
        Collections.addAll(collection,"n","j","k","g","d");

        for (var item: collection
             ) {
            System.out.println(item);
        }

        System.out.println("*********** collection list ***********");

        System.out.println(collection);

        System.out.println("********** Size ************");

        var size = collection.size();
        System.out.println(size);

        Object[] objectArray = collection.toArray();
        String[] stringArray = collection.toArray(new String[0]);

        Collection<String> other = new ArrayList<>();
        Collections.addAll(other, "a", "b", "c", "n", "j", "k", "g", "d");
//      or
//        Collections.addAll(collection)

        System.out.println("********** location in memory ************");
//        location in memory
        System.out.println(collection == other);

        System.out.println("********* compare content *************");
//        compare content
        System.out.println(collection.equals(other));

        System.out.println("********* contains *************");

        collection.remove("a");
        var collectionA = collection.contains("a");
        System.out.println(collectionA);

        System.out.println("*********** removing all ***********");

//        removing all items
        collection.clear();
        var isEmpty = collection.isEmpty();
        System.out.println(isEmpty);

    }
}
