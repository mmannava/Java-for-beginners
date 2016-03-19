import java.util.Scanner;

/**
 * Created by Manasa on 3/18/2016.
 * data to the current node and link to the next node
 */
class Node{
    protected int data;
    protected  Node link;

    //Constructor
    public Node(){
        data = 0;
        link = null;
    }

    //Parameterized constructor
    public Node(int d, Node n){
        data = d;
        link = n;
    }

    //set link to next Node
    public void setLink(Node n) {
        link = n;
    }
    //set data to current Node
    public void setData(int d) {
        data = d;
    }

    //to get link to next node
    public Node getLink() {
        return link;
    }

    //get data from current node
    public int getData(){
        return data;
    }

}

class LinkedListOperations{
    protected Node head;
    protected Node tail ;
    public int size ;

    //Constructor
    public LinkedListOperations(){
        head = null;
        tail = null;
        size = 0;
    }

    //check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    //get size of list
    public int getSize() {
        return size;
    }

    //insert element
    public void insert(int value){
        Node nptr = new Node(value,null);
        size++ ;

        if(head == null)
        {
            head = nptr;
            tail = head;
        }else{
            tail.setLink(nptr);
            tail = nptr;
        }
    }

    public void delete(int pos){
        if (pos == 1)
        {
            head = head.getLink();
            size--;
            return ;
        }

        if (pos == size)
        {
            Node s = head;
            Node t = head;
            while (s != tail)
            {
                t = s;
                s = s.getLink();
            }
            tail = t;
            tail.setLink(null);
            size --;
            return;
        }
        Node ptr = head;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++)
        {
            if (i == pos)
            {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size-- ;
    }

    public void display(){
        System.out.print("\nSingly Linked List = ");
        if (size == 0)
        {
            return;
        }

        if (head.getLink() == null)
        {
            System.out.println(head.getData());
            return;
        }
        Node ptr = head;
        System.out.print(head.getData()+ "->");
        ptr = head.getLink();
        while (ptr.getLink() != null)
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "\n");

    }
}
public class LinkedList {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedListOperations list = new LinkedListOperations();
        char ch;
        do

        {
            System.out.println("Here are the linked list operations");
            System.out.println("1. insert at begining");
            System.out.println("2. for delete at position");
            System.out.println("3. for checking if the list is empty");
            System.out.println("4. get the size of the list");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to insert");
                    list.insert(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter position");
                    int p = sc.nextInt();
                    if (p < 1 || p > list.getSize())
                        System.out.println("Invalid position\n");
                    else
                        list.delete(p);
                    break;
                case 3:
                    System.out.println("Empty status = " + list.isEmpty());
                    break;
                case 4:
                    System.out.println("Size = " + list.getSize() + " \n");
                    break;
            }

            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = sc.next().charAt(0);

        }while(ch=='Y'||ch=='y');
    }
}


