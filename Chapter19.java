/**
 * Created by Manasa on 3/4/2016.
 */

class Chapter{
    String name;
    String authorname;
    public void chapterName(){
        System.out.println("Chapter18");
    }


    public void chapterAuthorName(){
        System.out.println("Manasa");
    }
}
public class Chapter19 extends Chapter {
    @Override
    public void chapterName(){
        super.chapterName();
        System.out.println("Chapter19");
    }

    @Override
    public void chapterAuthorName(){
        super.chapterAuthorName();
        System.out.println("Manasa Priyamvada Mannava");
    }

    public static void main(String args[]){
        Chapter19 ch = new Chapter19();
        ch.chapterName();
        ch.chapterAuthorName();


    }
}
