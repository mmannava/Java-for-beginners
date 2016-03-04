/**
 * Created by Manasa on 3/4/2016.
 *
 * Lets play hide and seek.
 * I will begin to seek once I finish counting from 1 to 10.
 * So you have 10 counts to hide, only after which, I shall start searching.
 */
public class Chapter4 {
    public static void main(String args[]){
        int count =1;
        while(count<=10){
            System.out.println("count:"+count);
            count = count+1;
        }
        System.out.println("I have counted till 10, and I am beginning to search!");
    }
}
