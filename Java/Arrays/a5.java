 import java.util.*;
public class a5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements in the array: ");
        for(int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        
       int mx=arr[0];
       for(int i=0;i<n;i++){
        if(arr[i]<mx){
            mx=arr[i];
        }
       
        }
         System.out.print("Minimum number in the array is : "+mx);

       }
    }
           
