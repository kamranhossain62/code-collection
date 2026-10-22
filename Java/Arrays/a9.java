import java.util.*;
public class a9{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int min=Integer.MAX_VALUE;
    System.out.print("Enter the elements : ");
    
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.print(min);
}
}
