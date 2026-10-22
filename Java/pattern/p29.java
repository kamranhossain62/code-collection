import java.util.*;
public class p29{
    public static void main(String args[]){
        int r,c, i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        r=sc.nextInt();
         for(i=1;i<=r;i++){
        for(j=1;j<=r-i;j++){
            System.out.print(" "+" ");
        }
        for(j = 1; j <= r; j++) {
             System.out.print(  "* "+" ");   
        }
          System.out.println( );
    
    }
}
}
