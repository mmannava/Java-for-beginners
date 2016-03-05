/**
 * Created by Manasa on 3/4/2016.
 */


public class Chapter18 {
    public static void main(String args[]){
        Integer a = 10;
        String b;
        Integer c;
        // for b to hold a, a should be converted toString()
        b = a.toString();
        System.out.println(b);
        // c to hold b, b should be converted into Integer
       c = Integer.parseInt(b);
        System.out.println(c);
    }
}
