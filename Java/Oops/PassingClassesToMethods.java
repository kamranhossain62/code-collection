// package Java.Oops;
import java.util.*;
public class PassingClassesToMethods {
    public static class car{
        //  we can also create methods inside a method.
        // attributes
        int seats;
        int torque;
        String name;
        String type;
        double length;
        void print(){
            System.out.println(seats+ " "+ name+ " "+length+" "+type+" "+torque );
        }
    }
    public static void main(String args[]){
        car c=new car();
        c.length=4.012;
        c.seats=5;
        c.torque=178;
        c.name="KIA SONNET";
        c.type="SUV";
        
        change(c);
        System.out.println(c.seats);
        c.print();
    }
    public static void change(car c){
        c.seats=4;
    }
}
