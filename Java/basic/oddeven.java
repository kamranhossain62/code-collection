import java.util.*;
public class oddeven {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int n = sc.nextInt();
        if(n%2==0)
            System.out.print("It is even.");
        else
            System.out.print("It is odd.");
    }
    
}
