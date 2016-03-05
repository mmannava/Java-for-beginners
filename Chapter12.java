/**
 * Created by Manasa on 3/4/2016.
 */

class Student{
    String name;
    long id;
    String college;
}
public class Chapter12 {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name="Manasa";
        s1.id=12345678;
        s1.college="Arizona State University";
        System.out.println( "Name:"+s1.name+ " "+"Id:"+s1.id+" "+"College:"+s1.college);
        Student s2 = new Student();
        s2.name = "Madhu";
        s2.id = 2345678;
        s2.college = "Shiv Nadar University";
        System.out.println( "Name:"+s2.name+ " "+"Id:"+s2.id+" "+"College:"+s2.college);


    }
}
