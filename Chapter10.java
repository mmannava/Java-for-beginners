import java.util.Scanner;

/**
 * Created by Manasa on 3/4/2016.
 * This an array of family members.
 */
public class Chapter10 {
    public static void main(String args[]){
    String[] family;
        family = new String[5];
        System.out.println("Enter the members of the family, pls enter your family name at the end.");
        System.out.println("Enter 4 family menber names with fifth entry being the family name");
        for(int i=0;i<5;i++){

            Scanner sc = new Scanner(System.in);
            family[i] = sc.nextLine();

        }
        System.out.println("The members in the "+family[4]+ " family are:");
        System.out.println(family[0]);
        System.out.println(family[1]);
        System.out.println(family[2]);
        System.out.println(family[3]);

    }
}
