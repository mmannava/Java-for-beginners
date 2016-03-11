import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Manasa on 3/9/2016.
 */
public class MergeSort {



    public static void merge(int[] subarray1, int[] subarray2, int[]list){
        //iSubarray1 is the position of the next element in the first sub array
        int iSubarray1 = 0;
        //iSubarray2 is the position of the next element in the second sub array
        int iSubarray2 = 0;
        //next open position in the result
        int j = 0;

        while(iSubarray1<subarray1.length && iSubarray2<subarray2.length){
            if(subarray1[iSubarray1]<subarray2[iSubarray2]){
                list[j] = subarray1[iSubarray1];
                iSubarray1++;
            }else{
                list[j] = subarray2[iSubarray2];
                iSubarray2++;
            }
            j++;
        }

        // Copy the values of subarray1 and subarray 2 into list array
        System.arraycopy(subarray1, iSubarray1, list, j, subarray1.length - iSubarray1);
        System.arraycopy(subarray2, iSubarray2, list, j, subarray2.length - iSubarray2);


    }



    public static int[] mergeSort(int[]list){
        if(list.length == 1){
            return list;
        }

        //Divide
        int[] subarray1 = new int[list.length / 2];
        int[] subarray2 = new int[list.length - subarray1.length];
        //Create copy of each of the sub arrays
        System.arraycopy(list, 0, subarray1, 0, subarray1.length);
        System.arraycopy(list, subarray1.length, subarray2, 0, subarray2.length);

        //recursion to sort subarray1 & subarray2
        mergeSort(subarray1);
        mergeSort(subarray2);

        //Conquer by Merging
        merge(subarray1,subarray2,list);

        return list;
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

        sortedlist=mergeSort(sortedlist);
        System.out.println("The sorted elements are:");
        for (int j=0;j<sortedlist.length;j++) {
            System.out.println(sortedlist[j]+" ");
        }
    }
}
