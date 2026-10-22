import java.util.*;
public class basic {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int [][] arr =new int[4][4];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
        // int[][] arr =new int[5][3]; {(0,0,0,)(0,0,0,)(0,0,0,)(0,0,0,)(0,0,0,)}
        // int [][] arr={{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3}};
        // for(int i=0;i<5;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(arr[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
    }
    System.out.println();
}
    }
}