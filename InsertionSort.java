import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Manasa on 3/9/2016.
 */
public class InsertionSort {

    private static void printSortedNumbers(int[]A){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+ ",");
        }
        System.out.println("\n");
    }

    public static void insertion(int[]A){
        for(int j =1; j<A.length;j++){
            int key = A[j];
            //insert A[j] into sorted sequence
            int i = j -1;
            while((i>-1)&&(A[i]>key)){
                A[i+1] = A[i];
                i = i -1;
            }
            A[i+1]=key;
            printSortedNumbers(A);
        }
    }

    public static void main(String args[]) throws IOException {


        //Create a string
        String list= "";
        int i=0,n=0;

        //Create an integer array list
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        System.out.println("Enter each element in the list, one element oer line");
        System.out.println(" Please indicate DONE at the end of your list ");
        //read the input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //read the input until done is encountered and insert each array element into the arrlist
        while(!(list=br.readLine()).equalsIgnoreCase("done")){
            int arrayelement=Integer.parseInt(list);
            arrlist.add(arrayelement);
        }

        //store elements from arrlist into sorted list one by one
        int sortedlist[]  = new int[arrlist.size()];
        Iterator<Integer> iter = arrlist.iterator();
        for (int j=0;iter.hasNext();j++) {
            sortedlist[j] = iter.next();
        }

        insertion(sortedlist);

    }
}
