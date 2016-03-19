/**
 * Created by Manasa on 3/18/2016.
 */
public class Stack {
    int top =0;
    public static void main(String args[]){
        int s[] = new int [10];
        s[0] = 0;
        Stack st = new Stack();
        st.insert(s,1);
        st.insert(s,2);
        st.insert(s,3);
        st.insert(s,4);
        System.out.println("Is the stack empty:"+st.stackEmpty(s));
        System.out.println("The deleted element is"+st.pop(s));
/**
        for (int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }

 **/
    }

    public boolean stackEmpty(int[]s){

        if(s[top] == 0){
            return true;
        }else{
            return false;
        }
    }

    public void insert(int[]s, int x){
            top = top +1;
            s[top] = x;
    }

    public int pop(int[]s){
            top = top -1;
           return s[top+1];


    }

}
