import java.util.*;
public class m2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      System.out.print("Enter the three number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int m=Math.max(a,Math.max(b,c));
            System.out.print("Maximum" + m);
        }
    }
