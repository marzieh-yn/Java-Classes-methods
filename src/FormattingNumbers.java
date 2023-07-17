import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(121346.4646);
        System.out.println(result);
//for change the name of a variable the shortcut way is shift+F6
        NumberFormat percent = NumberFormat.getPercentInstance();
        String results = percent.format(0.56);
        System.out.println(results);
//        method chaining
        String resultss = NumberFormat.getPercentInstance().format(0.84);
        System.out.println(resultss);
    }
}
