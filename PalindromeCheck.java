import java.util.Scanner;

/**
 * Created by Manasa on 3/24/2016.
 */
public class PalindromeCheck {
    public static void main(String args[]){
        int a;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        a  =sc.nextInt();
        String s_a = Integer.toString(a);
        StringBuilder s = new StringBuilder();
        s.append(s_a);
        String s1 = s.toString();
        //System.out.println(s);
        StringBuilder rev;
        rev = s.reverse();
        //System.out.println(rev);
        String s2 = rev.toString();

        if(s1.compareTo(s2)>0){
            System.out.println("Not Palindrome");
        }else if(s1.compareTo(s2)<0){
            System.out.println("Not Palindrome");
        }else{
            System.out.println("Palindrome");
        }



    }
}
