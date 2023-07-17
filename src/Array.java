import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
//        numbers[1]=1;
//        numbers[2]=2;
        int[] numbers = {1,5,8,7,2,9};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[4]);
    }
}
