/**
 * Created by Manasa on 3/9/2016.
 */
public class InsertionSortImp2 {

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

    public static void main(String args[]){
    int [] A = { 2, 3 , 1 , 9, 4, 5};
        insertion(A);
    }
}
