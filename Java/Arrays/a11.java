import java.util.*;
public class a11{
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
    System.out.print("Enter the number you want the sum of : ");
    int sum=sc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=i+1;i<n;j++){
            if(arr[i]+arr[j]==sum){

            }
        }
    }
}
}