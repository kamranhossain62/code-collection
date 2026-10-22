public class matricesmultiplication {
 public static void main(String args[]){
    public static void multiply(int[][] a, int[][] b){
        int n=a.length;
        int [][] c=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]=0;
            }
        }
        return c;
    }
}  
}

