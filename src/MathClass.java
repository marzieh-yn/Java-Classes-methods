public class MathClass {
    public static void main(String[] args){
       int x =  Math.round(1.3F);
        System.out.println(x);
//        return the smallest integer that is greater than or equal to this number
        int y =  (int)Math.ceil(1.3F);
        System.out.println(y);
        //        return the largest integer that is smaller than or equal to this number
        int z =  (int)Math.floor(1.3F);
        System.out.println(z);

        int c =  Math.max(2, 5);
        System.out.println(c);

        int cx =  Math.min(2, 5);
        System.out.println(cx);

        double cxy =  Math.random()*100;
        System.out.println(cxy);

        int rx =  (int)(Math.random()*100);
        System.out.println(rx);


        int r =  (int)Math.round(Math.random()*100);
        System.out.println(r);


    }
}
