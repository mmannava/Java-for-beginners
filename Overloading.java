/**
 * Created by Manasa on 3/11/2016.
 * Method overloading as an example for polymorphism
 */
public class Overloading {
    public static void main(String args[]){
    Editor e = new Editor();
        e.editorname("IntelliJ");
        e.editorname("IntelliJ","Java");
    }
}
class Editor{
    public void editorname(String editorname){
        System.out.println("The name of the editor is"+editorname);
    }

    public void editorname(String editorname, String usage){
        System.out.println("The name of the editor is "+editorname);
        System.out.println("This editor is used for developing "+usage+" applications");
    }
}