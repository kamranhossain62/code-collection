import java.util.*;
public class prime {
    public static void main(String args[]){
         Scanner sc =new Scanner(System.in);
         boolean flag=false;
        int n;
        System.out.print("Enter the number : ");
        n=sc.nextInt();
        if (n<=1) {
            System.out.print("Not prime ");
            return;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    flag=true;
                    break;
                }
            }
        }
            
        
        if(flag==false){
            System.out.print("prime ");
        } else{
            System.out.print("Not prime ");
        }

    }
    
}
