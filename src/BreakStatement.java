import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true){
            System.out.println("input: ");
            input =scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}
