import java.util.Scanner;

public class max {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int [][] arr={{1,2,30},{100,2,3},{1,202,3},{1,2,301},{1036,2,3}};
        int maxsum=Integer.MIN_VALUE;
        int row=-1;
        for(int i=0;i<5;i++){
             int sum=0;
           for(int j=0;j<3;j++){
            sum+=arr[i][j];
    }
    if(sum>maxsum){
        maxsum=sum;
        row=i;
    }
    
}
 System.out.print(row + " "+ maxsum);
    }
}
    
