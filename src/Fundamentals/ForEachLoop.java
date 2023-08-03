package Fundamentals;

public class ForEachLoop {
    public static void main(String[] args){
        String[] fruits = {"Apple", "Orange", "Mango"};
        for(int i=0;i< fruits.length;i++){
            System.out.println(fruits[i]);
        }
//        foreach loop
        for(String fruit : fruits)
            System.out.println(fruit);

    }
}
