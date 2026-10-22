import java.util.*;
public class count {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        if(n==0) n=7; 
        int c=0;
        while(n!=0){
            n=n/10;
            c++;
        }
        System.out.print("Number of digits : "+c);
    }
}