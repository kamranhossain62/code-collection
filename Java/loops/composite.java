/*import java.util.*;

public class composite {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int i,n;
        System.out.print("Enter the number : ");
        n=sc.nextInt();
        boolean flag=true;
        for(i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n==1){
                    flag=false;
                    break;
                }
            }
                    System.out.print("Neither prime nor composite.");
                {
                else if(flag==false)
                 System.out.print(" composite number .");   
                }
                else{
                    System.out.print("prime number .");
                }

            }
    }
}*/
import java.util.*;

public class composite {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int i,n;
        System.out.print("Enter the number : ");
        n=sc.nextInt();

        boolean flag=false;   // changed

        for(i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=true;    // changed
                break;
            }
        }

        if(n==1){
            System.out.print("Neither prime nor composite.");
        }
        else if(flag==true){
            System.out.print(" composite number .");   
        }
        else{
            System.out.print("prime number .");
        }
    }
}