/**
 * Created by Manasa on 3/4/2016.
 * Lets grant nationality based on place of birth;
 */
public class Chapter6 {
    public void citizen( String name, String placeOfBirth){
        String Name = name;
        String PlaceOfBirth = placeOfBirth;
        if(PlaceOfBirth.equalsIgnoreCase("India")){
            System.out.println("Indian citizen");
        }else if(PlaceOfBirth.equalsIgnoreCase("America")){
            System.out.println("American citizen");
        }else{
            System.out.println("You belong to:"+PlaceOfBirth);
        }

    }

    public static void main(String args[]){
        Chapter6 ch = new Chapter6();
        ch.citizen("Manasa", "India");
        ch.citizen("Joy", "America");
        ch.citizen("Sanga", "SriLanka");

    }
}
