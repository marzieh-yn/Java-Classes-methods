import java.awt.*;
import java.util.Date;

public class MyFirstClass {
    public static void main(String[] args){

        Date now = new Date();
//        now.getTime();
        System.out.println(now);

        System.out.println("it is gonna show the primitive type ");
        byte x = 1;
        byte y = x;
        x = 3;
        System.out.println(x);
        System.out.println(y);

        System.out.println("it is gonna show the reference type ");
        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 3;
        System.out.println(point2);
        System.out.println(point1);
//        it is saving the address of point1 into point2 not the value -> in reference types.by changing one value in each it will affect both of them
//        but in primitive types like characters and booleans or integer it saves the value only like : int x=1; int y=x; it's
//        going to save only the value which is 1

    }
}
