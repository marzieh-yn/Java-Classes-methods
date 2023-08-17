package AdvanceJava.Streams;

import Fundamentals.Array;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamsDemo {
  public static void show() {
    List<Movie> movies = List.of(
            new Movie("d", 22, Genre.COMEDY),
            new Movie("e", 11, Genre.COMEDY),
            new Movie("a", 35, Genre.ACTION),
            new Movie("c", 11, Genre.THRILLER),
            new Movie("b", 5, Genre.THRILLER)
    );

//    imperative programming
    int count = 0;
    for (var movie : movies)
      if (movie.getLikes() > 10)
        count++;
    System.out.println(count);

    System.out.println("------");

//    Declarative (Functional) Programming
    var count2 = movies.stream().filter(movie -> movie.getLikes() > 10).count();
    System.out.println(count2);

    System.out.println("------");

//    collection
    /*Collection<Integer> x;
    x.stream();*/
    var list = new ArrayList<>();
    list.stream();
    int[] numbers = {1, 2, 3, 4};
    Arrays.stream(numbers).forEach(n -> System.out.println(n));

    System.out.println("------");

    Stream.of(1, 2, 5, 4);
    var stream = Stream.generate(() -> Math.random());
    stream
            .limit(3)
            .forEach(System.out::println);

    System.out.println("------");

    Stream.iterate(1, n -> n + 1)
            .limit(10)
            .forEach(n -> System.out.println(n));

    System.out.println("********** mapping ************");
    //    mapping
    movies.stream()
            .map(movie -> movie.getTitle())
            .forEach(System.out::println);

    System.out.println("********** flat mapping ************");
    //   flat mapping
    var stream2 = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
//      stream2.forEach(System.out::println);
//        [1, 2, 3]
//        [4, 5, 6]
    stream2
            .flatMap(list2 -> list2.stream())
            .forEach(System.out::println);

    System.out.println("********** filtering elements ************");
    //   filtering
    Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;
    movies.stream()
            .filter(isPopular)
            .forEach(n -> System.out.println(n.getTitle()));

    System.out.println("------");

    System.out.println("********** slicing streams -> limit ************");
    //   slicing streams
    movies.stream()
            .limit(2)
            .forEach(n -> System.out.println(n.getTitle()));

    System.out.println("********** slicing streams -> skip ************");
    movies.stream()
            .skip(2)
            .forEach(n -> System.out.println(n.getTitle()));

//      1000 movies - 10 movies per page - for jumping to 3rd page we should skip 20 movies
//      skip(20) =  skip( (page -1) * pageSize) , limit(10) = limit(pageSize)

    System.out.println("********** slicing streams -> take while ************");
    movies.stream()
            .takeWhile(n -> n.getLikes() < 30)
            .forEach(n -> System.out.println(n.getTitle()));

    System.out.println("********** slicing streams -> drop while ************");
    movies.stream()
            .dropWhile(n -> n.getLikes() < 30)
            .forEach(n -> System.out.println(n.getTitle()));

    System.out.println("********** sorting streams ************");
    movies.stream()
//              .sorted((a,b) -> a.getTitle().compareTo(b.getTitle()))
            .sorted(Comparator.comparing(Movie::getTitle).reversed()) // it returns stream from end to start
            .forEach(n -> System.out.println(n.getTitle()));

    System.out.println("********** Getting unique elements ************");
    movies.stream()
            .map(Movie::getLikes)
            .distinct()
            .forEach(System.out::println);

    System.out.println("********** Peek method ************");
//    by using peek method we can see the output of each operation. but by using foreach we can not see the result after
//    each step because when we use foreach we can not add any more operation and the code is finished
    movies.stream()
            .filter(m -> m.getLikes() > 10)
            .peek(m -> System.out.println("filtered:" + m.getTitle()))
            .map(Movie::getTitle)
            .peek(t -> System.out.println("mapped:" + t))
            .forEach(System.out::println);

    System.out.println("********** Reducers ************");

    var count3 = movies.stream()
            .count();
    System.out.println(count3);

    System.out.println("------");

    var anyMatch = movies.stream()
            .anyMatch(m->m.getLikes()>10);
    System.out.println(anyMatch);

    System.out.println("------");

    var allMatch = movies.stream()
            .allMatch(m->m.getLikes()>10);
    System.out.println(allMatch);

    System.out.println("------");

    var noneMatch = movies.stream()
            .noneMatch(m->m.getLikes()>10);
    System.out.println(noneMatch);

    System.out.println("------");

    var first = movies.stream()
            .findFirst()
            .get();
    System.out.println(first.getTitle());

    System.out.println("------");

    var findAny = movies.stream()
            .findAny()
            .get();
    System.out.println(findAny.getTitle());

    System.out.println("------");

    var max = movies.stream()
            .max(Comparator.comparing(Movie::getLikes))
            .get();
    System.out.println(max.getTitle());

    System.out.println("------");
//    [22,11,35,11,5] -> [33,35,11,5] -> [68,11,5] -> [79,5] -> [84]
    Optional<Integer> sum = movies.stream()
            .map(Movie::getLikes)
//            .reduce( (a,b) -> a+b );
            .reduce(Integer::sum);
    System.out.println(sum.orElse(0));

    System.out.println("********** Collectors ************");

    var resultCollector = movies.stream()
            .filter(m->m.getLikes()>10)
            .collect(Collectors.toList());
    System.out.println(resultCollector);

    System.out.println("------");

    var resultCollectorSet = movies.stream()
            .filter(m->m.getLikes()>10)
            .collect(Collectors.toSet());
    System.out.println(resultCollectorSet);

    System.out.println("------");

    var resultCollectorMap = movies.stream()
            .filter(m->m.getLikes()>10)
            .collect(Collectors.toMap(Movie::getTitle,Movie::getLikes));
    System.out.println(resultCollectorMap);

    System.out.println("------");

    var resultCollectorSum = movies.stream()
            .filter(m->m.getLikes()>10)
            .collect(Collectors.summingInt(Movie::getLikes));
    System.out.println(resultCollectorSum);

    System.out.println("------");

    var resultCollectorSummrize = movies.stream()
            .filter(m->m.getLikes()>10)
            .collect(Collectors.summarizingInt(Movie::getLikes));
    System.out.println(resultCollectorSummrize);

    System.out.println("------");

    var resultCollectorJoining = movies.stream()
            .filter(m->m.getLikes()>10)
            .map(Movie::getTitle)
            .collect(Collectors.joining(" , "));
    System.out.println(resultCollectorJoining);

    System.out.println("********** Grouping Elements ************");

    var resultGrouping = movies.stream()
            .collect(Collectors.groupingBy(Movie::getGenre));

    var resultGrouping1 = movies.stream()
            .collect(Collectors.groupingBy(
                    Movie::getGenre, Collectors.toSet()));

    var resultGrouping2 = movies.stream()
            .collect(Collectors.groupingBy(
                    Movie::getGenre, Collectors.counting()));

    var resultGrouping3 = movies.stream()
            .collect(Collectors.groupingBy(
                    Movie::getGenre,
                    Collectors.mapping(Movie::getTitle,
                            Collectors.joining(","))
            ));

    System.out.println(resultGrouping1);
    System.out.println("------");
    System.out.println(resultGrouping2);
    System.out.println("------");
    System.out.println(resultGrouping3);
    System.out.println("------");
    System.out.println(resultGrouping);

    System.out.println("********** Partitioning Elements ************");

    var resultPartition = movies.stream()
            .collect(Collectors.partitioningBy(
                    m -> m.getLikes() > 20,
                    Collectors.mapping(Movie::getTitle ,
                            Collectors.joining(","))
            ));
    System.out.println(resultPartition);

    System.out.println("********** Primitive type stream ************");
    IntStream.rangeClosed(1,5)
            .forEach(System.out::println);

    System.out.println("------");

    IntStream.range(1,5)
            .forEach(System.out::println);
  }
}
