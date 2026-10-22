import java.util.*;
public class moveallzeroes {
    public static void print(int arr[]){
        for(int x:arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,0,-2,3,0,5,9,75};
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.print("after sorting : ");
        print(arr);
    }
}
