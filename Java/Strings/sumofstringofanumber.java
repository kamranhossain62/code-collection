import java.util.*;
public class sumofstringofanumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s="1234";
        int sum=0;
         for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
            String sub=s.substring(i,j+1);
            sum+=Integer.parseInt(sub);
            }
        }
            System.out.println(sum);
        }
    }
    

