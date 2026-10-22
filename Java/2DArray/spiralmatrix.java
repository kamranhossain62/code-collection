import java.util.*;
public class spiralmatrix {
    public static void main(String args[]){
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        spiralmatrix obj = new spiralmatrix();
        System.out.println(obj.spirallyTraverse(arr));
    }

    public ArrayList<Integer> spirallyTraverse(int[][] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        int row=arr.length,column=arr[0].length;
        int firstrow=0,lastrow=row-1,firstcol=0,lastcol=column-1;
        while(firstrow<=lastrow && firstcol<=lastcol){
        //    Right
            for(int i=firstcol;i<=lastcol;i++){
                ans.add(arr[firstrow][i]);
            }
            firstrow++;
            // Down
            for(int i=firstrow;i<=lastrow;i++){
                ans.add(arr[i][lastcol]);
            }
            lastcol--;
            // Left
            if(firstrow<=lastrow){
                for(int i=lastcol;i>=firstcol;i--){
                    ans.add(arr[lastrow][i]);
                }
                lastrow--;
            }
            // Up
            if(firstcol<=lastcol){
                for(int i=lastrow;i>=firstrow;i--){
                    ans.add(arr[i][firstcol]);
                }
                firstcol++;
            }
        }
        return ans;
    }
    
}
