import java.util.*;
public class selectionsort {
    public static void print(int arr[]){
        for(int X : arr){
        System.out.print(X+ " ");
    }

    System.out.println();
}
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements in the array : " );
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int min=arr[i],mindx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        System.out.print("After sorting : ");
        print(arr);
      }
}
