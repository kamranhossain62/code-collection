import java.util.*;
public class Constructors {
     public static class car{
        //  we can also create methods inside a method.
        // attributes
        int seats;
        String name;
        double length;
        car(){ // default constructor

        }
            car(int x,String s,double d){ // default constructor
            seats=x;
            name=s;
            length=d;
            }
             car(double d,int x,String s){ // default constructor
            seats=x;
            name=s;
            length=d;
            }
            void print(){
            System.out.println(seats+ " "+name+" "+length);
            }
    }
    public static void main(String args[]){
        car c1=new car(5000500,"Kia Sonet",2.99);
        c1.print();
        car c2=new car(5.00,2,"Aston Martin");
        c2.print();
}
}
