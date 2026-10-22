import java.util.*;
public class a6{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter the elements : ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        if(i%2!=1){
         arr[i]+=10;
        } else{
            arr[i]*=2;
        }
    }
    System.out.print("The array will be ");
    for(int i=0;i<n;i++){
        System.out.print(arr[i] + " " );
    }
}
}