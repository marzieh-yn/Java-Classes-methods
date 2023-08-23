package AdvanceJava.Executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ExecutorsDemo {


  public static void show() {
    var executor = Executors.newFixedThreadPool(2);

    executor.submit(() -> {
      System.out.println(Thread.currentThread().getName());
    });


    try {
      var future = executor.submit(() -> {
        LongTask.simulate();
        return 1;
      });

      System.out.println("Do more work");

      try {
//      future.get()  block the current thread and having to wait until the result of this operation is ready
        var result = future.get();
        System.out.println(result);
      } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
      }
    }
    finally {
      executor.shutdown();
    }
  }
}
