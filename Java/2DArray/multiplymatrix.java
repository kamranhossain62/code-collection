public class multiplymatrix {
    public int[][] constructProductMatrix(int[][] grid) {
    public static void multiply(int[][] a, int[][] b){
    int n=a.length;
    int c[][]=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            c[i][j]=0;
            for(int k=0;k<n;k++){
                c[i][j]+=a[i][k]*b[k][j];
            }
        }
    }
    }
    }
}
