public class Casting {
    public static void main(String[] args){
        double z = 1.1;
        double v = z + 2 ;
        System.out.println(v);

        double x = 1.1;
        int y = (int)x + 2 ;
        System.out.println(y);

        String a = "2";
        String t = "3.5";
        float w = Float.parseFloat(t) + 5;
        System.out.println(w);
        int o = Integer.parseInt(a) + 5;
        System.out.println(o);
    }
}
