/**
 * Created by Manasa on 3/4/2016.
 * This example illustrates the use of StringBuilder
 */
public class Chapter17 {
    public static void main(String args[]){
    StringBuilder s = new StringBuilder();
        s.append("I am Manasa");
        s.append(" Priyamvada ");
        s.append("Mannava");

        String name = "";
        name += "Prameela";
        name += " Madhumathi ";
        name += "Mannava";
        System.out.println(s);
        System.out.println(name);
    }
}
