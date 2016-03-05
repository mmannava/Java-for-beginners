/**
 * Created by Manasa on 3/5/2016.
 *
 * 
 *
 *
 *
 *
 */

class Addition{

    //this class illustrates method overloading
    public void add(int a, int b){

        System.out.println("Sum of 2 numbers is:"+(a+b));
    }
    public void add(int a, int b, int c){
        System.out.println("Sum of the 3 numbers is:"+(a+b+c));
    }


}

public class Chapter21 {
    public static void main(String args[]){
    Addition a = new Addition();
        a.add(1,2);
        a.add(1,2,3);
    }
}
