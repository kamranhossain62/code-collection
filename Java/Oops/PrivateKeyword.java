import java.util.*;
class Students{
    //  we use getter and setter methods to access private properties of a class.
    //  the whole process is called Encapsulation.
    String name="kamran"; // default value otherwise it will be Null.
        private int rno;
        double cgpa;//0.0
        void print(){ // getter method
            System.out.println(name+" "+rno+" "+cgpa);
        }
        int GetRno(){ // getter 
            return rno;
        }
        void setRno(int x){ // setter method
            rno=x;
        }

    }
public class PrivateKeyword {
    public static void main(String args[]){
    Students s1=new Students();
    s1.print();
   // System.out.println(s1.rno);
    s1.cgpa=6.59;
    s1.name="Judith";
    s1.print();
    s1.setRno(63);
    System.out.println(s1.GetRno());
    }
}
