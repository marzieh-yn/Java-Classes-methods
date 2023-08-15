package AdvanceJava.Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
  public static void show() {
    Queue<String> queue = new ArrayDeque<>();
    queue.add("c");
    queue.add("a");
    queue.add("b");
    queue.offer("e");
//    e-> b -> a -> c

//    get the first item at queue
    var first = queue.peek();
    System.out.println(first);

    var front1 = queue.element();
    System.out.println(front1);

    System.out.println(queue);

    var front = queue.remove();
    System.out.println(front);

    front = queue.element();

    System.out.println(front);
    System.out.println(queue);

    // We have alternative methods that don't
    // throw an exception:

    // offer() similar to add()
    // poll() similar to remove()
    // peek() similar to element()
  }
}
