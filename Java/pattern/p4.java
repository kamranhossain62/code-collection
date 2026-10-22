import java.util.*;
public class p4{
    public static void main(String args[]){
        int r,c, i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        r=sc.nextInt();
        // System.out.print("Enter the number of columns: ");
        // c=sc.nextInt();
    
    for(i=1;i<=r;i++){
        for(j=1;j<=r;j++){
       
         System.out.print((char)(j+64)+ " ");
         }
        System.out.println( );
    }
    
    }
}
