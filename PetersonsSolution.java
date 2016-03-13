/**
 * Created by Manasa on 3/13/2016.
 * Peterson's solution for Critical Section Problem
 * There are 2 processes P1 and P2, this program allows you to understand, which process will execute it's critical section
 */
public class PetersonsSolution {
    public static void main(String args[]){
    //Consider 2 variables
        int turn;
        boolean flag[] = new boolean[3];

        //consider that when Procedure 2 executes it's critical section procedure 1 should not.
        turn = 2;
        flag[2] = true;
        while(turn==2 && flag[2]==true){
            System.out.println("Execute Process 2's critical section");
            //After Procedure 2 executes it's critical section set the var values for the next Process to execute.
            flag[2] = false;
        }

    }
}
