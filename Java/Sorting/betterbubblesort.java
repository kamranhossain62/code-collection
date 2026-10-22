// import java.util.*;

// public class betterbubblesort {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the size : ");
//         int n=sc.nextInt();
//         System.out.print("Enter the elements in the array : ");
//           int arr[]=new int[n];
//           for(int i=0;i<n;i++){
//             for(i=0;i<n-1;i++){
//                 boolean issorted=true;
//                 for(int j=0;j<n-1;j++){
//                     if(arr[j]>arr[j+1]){
//                         issorted=false;
//                         break;
//                     }
//                 }
//                 if(issorted==true)break;
//                 for(int j=0;j<n-1-i;j++){
//                     if(arr[j] > arr[j+1]){
//                         int temp=arr[j];
//                         arr[j]=arr[j+1];
//                         arr[j+1]=temp;
//                     }
//                 }
//             }
//             print(arr);
//           }
          
//     }
    
// }
import java.util.*;

public class betterbubblesort {

    public static void print(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {

            boolean isSorted = true;

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }

            if (isSorted)
                break;
        }

        System.out.println("Sorted array:");
        print(arr);

        sc.close();
    }
}