import java.util.Scanner;

/**
 * Created by Manasa on 3/24/2016.
 */
public class EvenOrOdd {

    public static void main(String args[]){
        int a;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        a  = sc.nextInt();
        if(a%2==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
    }
}
