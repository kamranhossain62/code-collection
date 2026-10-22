import java.util.*;
public class a10{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    boolean flag=false;
    System.out.print("Enter the elements in the array : ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
       System.out.print("Enter the element you want to search : ");
       int target=sc.nextInt();
       for(int i=0;i<arr.length;i++){
       if(arr[i]==target){
        flag=true;
        break;
       }
    }
    if(flag)
         System.out.print("Element is present.");
        else 
              System.out.print("Element is not present. ");
    }
}
