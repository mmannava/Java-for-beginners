/**
 * Created by Manasa on 3/17/2016.
 */
public class LinearProbing {

    public int hashFunction(int k, int i){
        int slot;
        //h'(k) =2; (h'(k) + i) mod m
        slot = (k+i)% 5;
        return slot;
    }
    public static void main(String args[]){
        int a[];
        a = new int[6];
        LinearProbing lp = new LinearProbing();

        System.out.println("The element is inserted at:"+lp.insert(a,6));
        System.out.println("The element is present at:"+lp.search(a,6));
    }

    public int insert(int[] a, int k){
         int i=0;
        while(i<=a.length){
            int slot = hashFunction(k,i);
            if(a[slot] == 0){
                a[slot] = k;
                return slot;
            }else{
                i = i+1;
            }
        }
        return 0;
    }

    public int search(int[]a,int k){
        int i=0;
        while(i<=a.length){
            int slot = hashFunction(k,i);
            if(a[slot] == k){
                return slot;
            }
            i = i+1;
        }
        return 0;
    }
}
