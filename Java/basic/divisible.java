import java.util.*;
public class divisible {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            System.out.println("The number is divisible ");
         } else{
            System.out.print("The number is not divisible ");

            }
        
    }
}