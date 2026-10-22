import java.util.*;
public class Userdefinedatatype{
    // Data type [Class]
    public static class Student{  // khudka ek data type bana liya hai
    String name;
    int rollno;
    double cgpa;
    }
    public static void main(String args[]){
        // s1,s2,s3 is an object 
        Scanner sc=new Scanner(System.in); // scanner is a class,sc is an object.
        Student s1=new Student(); // creating new object(declaration)
        s1.name="Kamran";
        s1.rollno=63;
        s1.cgpa=7.11;

        Student s2=new Student(); // creating new object(declaration)
        s2.name="Kamran";
        s2.rollno=sc.nextInt();
        s2.cgpa=7.11;

        Student s3=new Student(); // creating new object(declaration)
        s3.name="Kamran";
        s3.rollno=63;
        s3.cgpa=7.11;
        System.out.println(s1.name+ " "+s1.cgpa+ " "+s1.rollno);
        s2.cgpa=9.7;
        System.out.println(s2.cgpa);
        System.out.println(s2.rollno);
    }
    
}
