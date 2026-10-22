import java.util.*;
public class power{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        System.out.print("Enter the power: ");
        int m=sc.nextInt();
        int p=1;
        for(int i=1;i<=m;i++){
         p*=n;

        }
        System.out.print(p);
    }
}
