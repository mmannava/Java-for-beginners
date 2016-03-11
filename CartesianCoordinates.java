/**
 * Created by Manasa on 3/11/2016.
 *
 * This is an example for encapsulation of data
 */
public class CartesianCoordinates {


    //declare the x and y coordinates
    private int x;
    private int y;

    //parameterized constructor
    public CartesianCoordinates(int x, int y){
        this.x =x;
        this.y =y;
    }

    //Copy Constructor
    public CartesianCoordinates(CartesianCoordinates cc){
        x = cc.getX();
        y = cc.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public CartesianCoordinates relativePoints(int dx, int dy){
        return new CartesianCoordinates(x+dx,y+dy);
    }

    //Code to represent answer as Coordinates
    public String toString(){
      StringBuffer s = new StringBuffer();
        s.append("(");
        s.append(x);
        s.append(",");
        s.append(y);
        s.append(")");
        return s.toString();
    }
    public static void main(String args[]){
        CartesianCoordinates p1 = new CartesianCoordinates(5,10);
       System.out.println(p1.relativePoints(-5,5));

    }

}
