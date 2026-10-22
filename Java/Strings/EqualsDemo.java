import java.util.*;

public class EqualsDemo {

    // User-defined equals method
    public static boolean equals(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String args[]) {

        String s1 = new String("kamran");
        String s2 = new String("kamran");
        String s3 = "kamran";
        String s4 = "kamran";

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));

        // Calling our own equals method
        System.out.println(equals(s1, s2));
    }
}