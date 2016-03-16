/**
 * Created by Manasa on 3/16/2016.
 */
public class DirectAddressingHashTables {
    public int search(int [] a, int k){
        return a[k];
    }

    public void insert(int[] a, int x){
        a[x] = x;
    }

    public void delete(int[] a, int k){
        a[k] = 0;
    }

    public static void main(String args[]){
        int []a;
        a = new int[]{0, 1, 3, 3, 4};
        DirectAddressingHashTables dah = new DirectAddressingHashTables();
        dah.search(a,1);
        dah.insert(a,2);
        dah.delete(a,4);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}

