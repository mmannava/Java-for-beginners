/**
 * Created by Manasa on 3/4/2016.
 */

class StudentDetails{

    String name;
    long id;

    public void studentDetails(){
        System.out.println("Student Name:"+name);
        System.out.println("Student id:"+id);
    }
}

public class Chapter13 {

    public static void main(String args[]){
    StudentDetails s1 = new StudentDetails();
    s1.name = "Manasa";
    s1.id = 12345678;
    s1.studentDetails();
    }

}
