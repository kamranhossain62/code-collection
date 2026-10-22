import java.util.*;
public class p17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r+1-i;j++){
                System.out.print((char)(i+64) +" ");
            }
             System.out.println();
        }
    }

}