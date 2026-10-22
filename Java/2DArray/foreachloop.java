import java.util.*;
public class foreachloop {
    public static void main(String args[]){
        int[][] arr={{2,5,3,4},{5,4,8,6},{6,2,3,1},{4,6,8,4}};
             for(int[] a:arr){ // copying 2d-array into 1d-array
                for(int ele:a){
                 System.out.print(ele + " ");
                }
                  System.out.println();
            }
        // for(int i=0;i<arr.length;i++){
        //     for(int ele: arr[i]){
        //       System.out.print(ele + " ");
        //     }
        //       System.out.println();
        }
    }
    

