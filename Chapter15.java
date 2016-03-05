/**
 * Created by Manasa on 3/4/2016.
 */


class Car{
    String name;
    String company;
    long price;

    public void carName(String name){
        System.out.println("Car Name:"+name);
    }

    public void carCompany(String company){
        System.out.println("Car Company:"+company);
    }

    public void carprice(long price){
        System.out.println("Car Price:"+price);
    }
}
public class Chapter15 {
    public static void main(String args[]){
    Car c=new Car();
        c.carName("Chrysler300");
        c.carCompany("Chrysler");
        c.carprice(910250);
    }
}
