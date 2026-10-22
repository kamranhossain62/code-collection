 import java.util.*;
public class reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int r=0;
        while(n!=0){
            r*=10;
            r+=(n%10);
        n/=10;
        }
        
        System.out.print(r );
    }
} 
    

class Solution {
    public int reverse(int x) {
        int n=0;
        while(x!=0){
            n*=10;
            n=+(x%10);
            n/=10;


        }
        return n;
        
    }
}