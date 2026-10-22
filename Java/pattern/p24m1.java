import java.util.*;
public class p24m1 {
    public static void main(String args[]) {
        int r, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        r = sc.nextInt();

        for(i = 1; i <= r; i++) {
            for(j = 1; j <= r; j++) {
                if(i+j>r)
                System.out.print(  "* ");   
            else System.out.print("  ");
            }
            System.out.println(); 
        }
    }
}