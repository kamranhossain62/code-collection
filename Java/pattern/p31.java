import java.util.*;
public class p31{
    public static void main(String args[]){
        int r,a, i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        r=sc.nextInt();
         for(i=1;i<=r;i++){
        for(j=1;j<=r-i;j++){
            System.out.print(" "+" ");
        }
        for(j = 1; j <= 2*i-1; j++) {
             System.out.print(  "*"+" ");  
        }
          System.out.println( );
    
    }
}
}