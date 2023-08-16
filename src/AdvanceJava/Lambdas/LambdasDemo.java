package AdvanceJava.Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class LambdasDemo {
  public LambdasDemo(String message) {
  }

  public static void print(String message){}
  public void prints(String message){}
  public static void show() {

    greet(new ConsolePrinter());

    System.out.println("********* anonymous inner *************");

//  anonymous inner class and do same with the code above
    greet(new Printer() {
      @Override
      public void print(String message) {

      }
    });

    System.out.println("******** using method reference **************");

//  Lambda Expression, if we have single parameter we do not need to specify the type like string, also we can remove parentheses
//    of message because it is only one parameter, we only use parentheses if we have no parameter or more than 1
//    Also if we only have one line of code we do not need to use this Braces

//    greet( (String message) -> {
//      System.out.println(message);
//    });

//    or

//    greet(message ->  System.out.println(message));

//    or a using method reference
    greet(System.out::println);

    System.out.println("********* using method reference *************");

//    referencing a static method , first we type the name of class that contains this method (print) :: the name of method
    greet(message -> print(message));
    greet(LambdasDemo::print);

    System.out.println("*********** passing a value to a constructor ***********");

//    and if the field was an instance not static same as our method:

//    var demo = new LambdasDemo();
//    greet(message -> demo.prints(message));
//    greet(demo::prints);

// passing a value to a constructor
    greet(message -> new LambdasDemo(message));
    greet(LambdasDemo::new);


//    Consumer interface
    List<Integer> list = List.of(1,5,8,3,4);

    System.out.println("********** imperative ************");

//    imperative programing (for ,if/else , switch/case)
    for(var item:list)
      System.out.println(item);

    System.out.println("********** Declarative ************");

//    Declarative programing
    list.forEach(System.out::println);

//    Chaining Consumer
    System.out.println("********* Chaining Consumer *************");

    List<String> list2 = List.of("a","b","d","g");
    Consumer<String> print = System.out::println;
    Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

    list2.forEach(print.andThen(printUpperCase).andThen(print));

//    Supplier Interface
    System.out.println("********** Supplier Interface ************");

    Supplier<Double> getRandom = () -> Math.random();
    var random = getRandom.get();
    System.out.println(random);

//    Functional Interface
    System.out.println("********** Functional Interface ************");

    Function<String, Integer> map = str -> str.length();
    var length = map.apply("Niloofar");
    System.out.println(length);

//   Compose Function
    System.out.println("********** Compose Function ************");

//    "key:value" -> "key=value" -> "{key=value}"
    Function<String, String> replaceColon = str -> str.replace(":","=");
    Function<String, String> addBraces = str -> "{" + str + "}";
//    Declarative Programming
    var result2 =  replaceColon
            .andThen(addBraces)
            .apply("key:value");
//    Compose we start with the second function then using first one
    var result3 = addBraces
            .compose(replaceColon)
            .apply("key:value");
    System.out.println(result3);
    System.out.println(result2);

//    Predicate Interface
    System.out.println("********** Predicate Interface ************");

    Predicate<String> isMoreThan5 = str -> str.length() > 5;
    var test1= isMoreThan5.test("sky");
    System.out.println(test1);

    Predicate<String> hasLeftBrace = str -> str.startsWith("{");
    Predicate<String> hasRightBrace = str -> str.endsWith("}");

    Predicate<String> hasRightAndLeftBrace = hasLeftBrace.and(hasRightBrace);
    Predicate<String> hasRightOrLeftBrace = hasLeftBrace.or(hasRightBrace);
    var test3 = hasRightOrLeftBrace.test("{nill}");
    var test2 = hasRightAndLeftBrace.test("{Niloo}");

    System.out.println(test2);
    System.out.println(test3);

    //    Binary Operator Interface
    System.out.println("********** Binary Operator Interface ************");
    BinaryOperator<Integer> add = (a,b) -> a+ b ;
    Function<Integer, Integer> square1 = a -> a * a;
    var result6 = add.andThen(square1).apply(2,5);
    System.out.println(result6);


//    Unary Interface
    System.out.println("********** Unary Interface ************");

    UnaryOperator<Integer> square = n -> n * n;
    UnaryOperator<Integer> increment = n -> n + 1;

    var result = increment.andThen(square).apply(1);
    System.out.println(result);
  }

  public static void greet(Printer printer){
    System.out.println("Hello World!");
  }
}
