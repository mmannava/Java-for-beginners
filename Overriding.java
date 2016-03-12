/**
 * Created by Manasa on 3/11/2016.
 * This program illustrates the polymorphism through method overriding
 */
public class Overriding {
public static void main(String args[]){
    IDE ide = new IDE();
    Eclipse e = new Eclipse();
    Netbeans n = new Netbeans();

    ide.name();
    ide.usage();
    e.name();
    e.usage();
    n.name();
    n.usage();
}
}

class IDE{
    public void name(){
        System.out.println("The Integrated development environment is a useful tool");
    }
    public void usage(){
        System.out.println("It is used by software developers");
    }
}
class Eclipse extends IDE{
    @Override
    public void name(){
        System.out.println("Eclipse is an IDE");
    }
    @Override
    public void usage(){
        System.out.println("Eclipse is used by java developers");
    }
}
class Netbeans extends IDE{
    @Override
    public  void name(){
        System.out.println("Netbeans is an IDE");
    }
    @Override
    public void usage(){
        System.out.println("Netbeans is used by java developers");
    }
}
