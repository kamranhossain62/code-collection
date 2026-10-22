import java.util.*;

public class p33 {
    public static void main(String args[]) {
        int r, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        r = sc.nextInt();

        // Top line
        for (i = 1; i <= 2 * r - 1; i++) {
            System.out.print("* ");
        }
        System.out.println();

        int nsp = 1;

        for (i = 1; i <= r - 1; i++) {

            // Left stars
            for (j = 1; j <= r - i; j++) {
                System.out.print("* ");
            }

            // Spaces
            for (j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Right stars
            for (j = 1; j <= r - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
            nsp += 2; // IMPORTANT (inside loop)
        }
    }
}