import java.util.*;
public class p23 {
    public static void main(String args[]) {
        int r, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        r = sc.nextInt();

        for(i = 1; i <= r; i++) {
            int a = 1;   // reset for every row

            for(j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a = a + 2;   // move to next odd number
            }
            System.out.println(); // next line after each row
        }
    }
}