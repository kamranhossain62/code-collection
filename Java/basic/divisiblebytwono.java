import java.util.*;
public class divisiblebytwono{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer :");
        int n =sc.nextInt();
        if(n%5==0){
            System.out.print("It is divisible by 5.");
        }else if(n%3==0){
            System.out.print("It is divisible by 3.");
         }
          else if(n%3==0 && n%5==0){
            System.out.print("It is divisible by both.");
           }else{
            System.out.print("It is not divisible by both.");

        }
    }
}