/**
 * Created by Manasa on 3/4/2016.
 * Lets prepare the color green by mixing blue and yellow
 * the color blue is represented as       B   Y
 *                                     B  1   0
 *                                     Y  0   0
 *
 *   The color green is represented as    B   Y
 *                                      B 0   0
 *                                      Y 0   1
 *
 *
 */


public class Chapter11 {
    static int[][] blue = {
            {1, 0},
            {0, 0}

    };
    static int[][] yellow ={
            {0, 0},
            {0, 1}
    };
    public static void main(String[]args){

        int [][] green = {
                {0, 0},
                {0, 0}
        } ;
        //need to optimize this, using 2 for loops


        green[0][0] = blue[0][0]+yellow[0][0];
        green[0][1] = blue[0][1]+yellow[0][1];
        green[1][0] = blue[1][0]+yellow[1][0];
        green[1][1] = blue[1][1]+ yellow[1][1];


        System.out.println("Green is represented by");
        System.out.println(green[0][0]+ " "+green[0][1]);
        System.out.println(green[1][0]+ " "+green[1][1]);

    }
}
