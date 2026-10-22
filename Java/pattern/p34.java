import java.util.*;
public class p34{
    public static void main(String args[]){
        int r,a, b,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        r=sc.nextInt();
         for(i=1;i<=2*r-1;i++){
        for(j=1;j<=2*r-1;j++){
            a=i;b=j;
            if(i>j) a=2*r-i;
             if(j>r) a=2*r-j;
            System.out.print(Math.min(a,b) + " ");
        }
          System.out.println( );
    
    }
}
}