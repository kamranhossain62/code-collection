import java.util.*;
public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int marks[];
        StudentData(int s[]){
                marks =s;
            // marks =new int[s];
        }
    }
    public static void main(String args[]){
        int arr[]={5,6,8,9};
         StudentData s1=new StudentData(arr);
         s1.marks[0]=40;
         System.out.println(arr[0]);
    //     StudentData s1=new StudentData(4);
    //         s1.marks[0]=74;
    //         s1.marks[1]=74;
    //         s1.marks[2]=74;
    //         s1.marks[3]=74;
   }
    
}
