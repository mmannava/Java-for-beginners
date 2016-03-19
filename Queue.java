/**
 * Created by Manasa on 3/18/2016.
 */
public class Queue {
    int tail = 0;
    int head = 0;
    public static void main(String args[]){
    Queue queue = new Queue();
        int q[] = new int[5];
        q[0]=0;
        queue.enqueue(q,1);
        queue.enqueue(q,2);
        queue.enqueue(q,3);
        queue.enqueue(q,4);
        queue.enqueue(q,5);
        System.out.println("The dequeued element is:"+queue.dequeue(q));
        for(int i=0;i<q.length;i++){
            System.out.print(q[i]+" ");
        }
    }

    public void enqueue(int q[], int x){
        q[tail]= x;
        if(tail == q.length){
            tail = 1;
        }else{
            tail++;
        }
    }

    public int dequeue(int q[]){
        int x = q[head];
        if(head == q.length){
            head =1;
            return 0;
        }else{
            head++;
            return  x;
        }
    }
}
