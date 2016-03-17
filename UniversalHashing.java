import java.util.Random;

/**
 * Created by Manasa on 3/16/2016.
 */
public class UniversalHashing {
    public int hashFunction(int[] a, int k){

        Random rn = new Random();
        //int m = a.length;
        int slot = rn.nextInt() % k;
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
        UniversalHashing u = new UniversalHashing();
        u.search(a,2);
        u.delete(a,2);
        u.insert(a,2);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
}
