import java.util.*;
public class triangle{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first side of the triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter the second side of the triangle : ");
        int b = sc.nextInt();
         System.out.print("Enter the third side of the triangle : ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && a+c>b ){
            System.out.print("It is a triangle.");

        }else{
             System.out.print("It is not a triangle.");

        }

    }

    
}
