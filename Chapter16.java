/**
 * Created by Manasa on 3/4/2016.
 */



public class Chapter16 {

    Chapter16(){
        System.out.println("This is the default constructor ");
    }

    Chapter16(String name){
        System.out.println("The name of this chapter is:"+name);
    }


    public static void main(String args[]){
    Chapter16 ch = new Chapter16();
    Chapter16  ch1 = new Chapter16("Constructors");
    }
}
