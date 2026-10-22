import java.util.*;
public class fourdigit {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int n = sc.nextInt();
        if(n>999 && n<10000)
            System.out.println("It is a four digit number." +n );
        else{
            System.out.print("It is not a four digit number." +n);
        }
    }
}