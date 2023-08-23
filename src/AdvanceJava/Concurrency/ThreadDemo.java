package AdvanceJava.Concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
  public static void show() {
    System.out.println(Thread.currentThread().getName());
    // We can create a thread using a lambda expression
    var thread1 = new Thread(() -> System.out.println("current thread is : " + Thread.currentThread().getName()));

    // or using an instance of a class that implements the Runnable interface
//    var thread2 = new Thread(new DownloadFileTask());

    List<Thread> threads = new ArrayList<>();
    List<DownloadFileTask> tasks = new ArrayList<>();

//    for(int i=0; i<10 ;i++){
//      var task = new DownloadFileTask();
//      tasks.add(task);
//      var thread3 = new Thread(task);
//      thread3.start();
//      threads.add(thread3);
//    }

    var totalBytes = tasks.stream()
            .map(t -> t.getStatus().getTotalBytes())
                    .reduce(Integer::sum);
    System.out.println("total bytes = " + totalBytes);

    var status = new DownloadStatus();
    var thread3 = new Thread(new DownloadFileTask(status));
    var thread4 = new Thread(() -> {
      while (!status.isDone()){
        synchronized (status){
          try {
            status.wait();
          }catch (InterruptedException e){
            e.printStackTrace();
          }
        }

      }
      System.out.println(status.getTotalBytes());
    });
    thread3.start();
    thread4.start();



    // Next we start a thread
    thread1.start();

    // We can wait for the completion of a thread
    try {
      thread1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // We can put a thread to sleep
    try {
      thread1.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // We can get the current thread
    var current = Thread.currentThread();
    System.out.println(current.getId());
    System.out.println(current.getName());
  }
}
