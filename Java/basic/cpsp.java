import java.util.*;
public class cpsp{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price : ");
        int cp = sc.nextInt();
        System.out.print("Enter the selling price : ");
        int sp = sc.nextInt();
        int p = sp-cp;
        int l=cp-sp;
        if(cp<sp){
            System.out.print("profit"+p);
        }else if(cp==sp){
             System.out.print("no profit no loss");
        }
        else{
            System.out.print("loss "+l);
        }
        

        }
        
    }
