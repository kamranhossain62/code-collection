import java.util.*;
public class binarytrianglep22{
    public static void main(String args[]){
        int r,c, i,j;
        int a=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        r=sc.nextInt();
      //   System.out.print("Enter the number of columns: ");
    //      c=sc.nextInt();
    
    for(i=1;i<=r;i++){
        for(j=1;j<=i;j++){
            if((i+j)%2==0){

            System.out.print("1 ");
        }else{
          System.out.print("0 ");
    }
}
System.out.println();
    }
    }
}
