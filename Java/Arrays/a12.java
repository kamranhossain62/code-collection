
import java.util.*;
public class a12{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int max=0;
    int smax=0;
    System.out.print("Enter the elements : ");
    
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        if(arr[i]>max){
            max=arr[i];
        }
    }
    for(int i=0;i<n;i++){
        if(arr[i]!=max && arr[i]>smax){
            smax=arr[i];

        }
    }
    System.out.println("The largest element in the array is : "+max);
      System.out.print("The second largest element in the array is : "+smax);
  
}
}
