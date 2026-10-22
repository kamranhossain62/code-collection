 import java.util.*;
public class a3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements in the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pro=1;
        int sum=0;
        for(int i = 0; i < n; i++) {
            pro*=arr[i];
            sum+=arr[i];
        }
        System.out.println("sum of the number is: " +sum);
        System.out.println("product of the number is : " +pro);
    }
}


           
