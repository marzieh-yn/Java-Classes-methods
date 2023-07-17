import java.util.Scanner;

public class While {
    public static void main(String[] args){
        for (int i=0;i<=2;i++)
            System.out.println("Welcome Home Nili " + i);
        int j = 2;
        while(j>=0){
            System.out.println("Welcome Home " + j);
            j--;
        }
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){
            System.out.println("input: ");
            input =scanner.next().toLowerCase();
            System.out.println(input);
        }
//        or
        do {
            System.out.println("input: ");
            input =scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}
