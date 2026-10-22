import java.util.*;
public class tranpose {
      public static void main(String args[]){
        int [][] arr={{2,5,3,4},{5,4,8,6},{6,2,3,1},{4,6,8,4}};        
        print(arr);
        for(int i=0;i<arr.length;i++){
                for(int j=0;j<i;j++){
                   int temp =arr[i][j];
                   arr[i][j]=arr[j][i];
                   arr[j][i]=temp;
                }
}
print(arr);
      }
      private static void print(int [][] arr){
        for(int[] a:arr){
            for(int ele:a){
                System.out.print(ele+ " ");
            }
            System.out.println();
        }
        System.out.println();
      }
    }