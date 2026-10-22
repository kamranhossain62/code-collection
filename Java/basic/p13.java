import java.util.*;
public class p13{
    public static void main(String args[]){
        int r,c, i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        r=sc.nextInt();
      //   System.out.print("Enter the number of columns: ");
    //      c=sc.nextInt();
    
    for(i=1;i<=r;i++){
        for(j=1;j<=i;j++){
            if(i % 2 != 0){
             System.out.print(j +" ");
            }else{
           System.out.print((char)(j+64)+" ");
          //  j++;
        }
         
    }
     System.out.println( );
    }
}
}