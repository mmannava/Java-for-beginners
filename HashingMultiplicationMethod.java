/**
 * Created by Manasa on 3/16/2016.
 */
public class HashingMultiplicationMethod {


    public int hashFunction(int[] a, int k){
        int m = a.length;
        int slot = m*(k % 1);
        return slot;
    }

    public int search(int [] a, int k){
        int slot = hashFunction(a, 2);
        return a[slot];
    }

    public void insert(int[] a, int x){
        int slot = hashFunction(a,2);
        a[slot] = slot;
    }

    public void delete(int[] a, int k){
        int slot = hashFunction(a,2);
        a[slot] = 0;
    }

    public static void main(String args[]){
        int [] a = new int [6];
        a = new int[]{1, 2, 3, 4, 5};
        HashingDivisionMethod d = new HashingDivisionMethod();
        d.search(a,2);
        d.delete(a,2);
        d.insert(a,2);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
