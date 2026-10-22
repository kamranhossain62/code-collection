import java.util.*;
public class a1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements in the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        System.out.print("Negative numbers are: ");
        for(int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }if(count==0){
                System.out.print("There are no negative numbers");
            }
        }
    }
