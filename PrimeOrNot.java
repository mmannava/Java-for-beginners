import java.util.Scanner;

/**
 * Created by Manasa on 3/24/2016.
 */
public class PrimeOrNot {
    public static void main(String args[]){
        System.out.println("Enter a number");
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        int temp;
        int count =0;
        for(int i=2;i<=a;i++){
            temp = a%i;
            if(temp == 0){
                count ++;
            }

        }
        if(count == 1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
