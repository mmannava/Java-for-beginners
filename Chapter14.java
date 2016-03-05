/**
 * Created by Manasa on 3/4/2016.
 */

class Employee{


    String name;
    String role;
    String designation;

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public String getDesignation() {
        return designation;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }


}
public class Chapter14 {
    public static void main(String args[]){
        Employee e = new Employee();
        e.setName("Manasa");
        e.setDesignation("Entry level");
        e.setRole("Software Deveoper");
        System.out.println("Employee Name:"+e.getName());
        System.out.println("Designation:"+e.getDesignation());
        System.out.println("Role:"+e.getRole());

    }
}
