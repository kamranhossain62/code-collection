import java.util.*;

public class GCDofnumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(GCDofnumber(a, b));
    }

    public static int GCDofnumber(int a, int b) {

        for (int i = Math.min(a, b); i >= 1; i--) {

            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        return 1;
    }
}