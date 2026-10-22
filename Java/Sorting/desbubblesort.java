import java.util.*;
public class desbubblesort {
    public static void print(int arr[]){
        for(int x:arr){
            System.out.print(x +" " );
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out .print("Enter the elements : ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]<arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
    }
        System.out.print("sorted array : ");
        print(arr);
    
    
}
}
