import java.util.*;
public class integer {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        double n = sc.nextDouble(); // n=3.144
        int x = (int)n; // type casting x=3
        if(n-x >0){
            System.out.print("It is not an integer.");
        }else{
            System.out.print("It is an integer.");

        }

    }
}