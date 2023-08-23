package AdvanceJava.Executors;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFuturesDemo {
    public static int toFahrenheit(int celsius){
        return (int)(celsius * 1.8) +32;
    }
    public static CompletableFuture<String> getUserEmailAsync(){
        return CompletableFuture.supplyAsync(() -> "email");
    }
    public static CompletableFuture<String> getPlaylistAsync(String email){
        return CompletableFuture.supplyAsync(() -> "play list");
    }

  public static void show() {

    getUserEmailAsync()
            .thenCompose(CompletableFuturesDemo::getPlaylistAsync)
            .thenAccept(System.out::println);


    var first = CompletableFuture.supplyAsync(() -> "20USD")
            .thenApply( str -> {
                    var price = str.replace("USD","");
                    return Integer.parseInt(price);
                    });
    var second = CompletableFuture.supplyAsync(() -> 0.9);
    first.thenCombine(second , (price,exchangeRate) -> price * exchangeRate)
            .thenAccept(System.out::println);



    var future1 = CompletableFuture.supplyAsync( () -> 20);
    future1
           .thenApply(CompletableFuturesDemo::toFahrenheit)
           .thenAccept(System.out::println);


    var start = LocalTime.now();

    var service = new FlightService();
    var futures = service.getQuotes()
            .map(future -> future.thenAccept(System.out::println))
            .collect(Collectors.toList());

    CompletableFuture
        .allOf(futures.toArray(new CompletableFuture[0]))
        .thenRun(() -> {
          var end = LocalTime.now();
          var duration = Duration.between(start, end);
          System.out.println("Retrieved all quotes in " + duration.toMillis() + " msec.");
        });

    try {
      Thread.sleep(10_000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
