import java.util.*;
public class p19 {
    public static void main(String args[]) {
        int r, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        r = sc.nextInt();

        int mid = r / 2 + 1;

        for(i = 1; i <= r; i++) {
            for(j = 1; j <= r; j++) {
                if(i == mid || j == mid) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // move to next line after each row
        }
    }
}
