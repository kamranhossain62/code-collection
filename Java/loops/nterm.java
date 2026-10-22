import java.util.*;

public class nterm {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i,n;
    System.out.print("Enter the n term: ");
    n=sc.nextInt();
    for(i=2;i<=3*n-1;i+=3){
        System.out.print(i+ " ");
    }
    }
    
}
