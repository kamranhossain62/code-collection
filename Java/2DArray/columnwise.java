import java.util.*;
public class columnwise {
public static void main(String args[]){
        int [][] arr={{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3}};
        for(int j=0;j<5;j++){
            for(int i=0;i<5;i++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    
}
}