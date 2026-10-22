import java.util.*;
public class a8{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter the elements : ");
    int product=1;
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        product*=arr[i];
    }
    System.out.print(product);
}
}

