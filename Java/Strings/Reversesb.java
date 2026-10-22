import java.util.*;
public class Reversesb {
    public static void main(String args[]){
        String s="kamran";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        // int i=0,j=sb.length()-1;
        // while(i<=j){
        //     char temp1=sb.charAt(i);
        //     char temp2=sb.charAt(j);
        //     sb.setCharAt(i,temp2);
        //     sb.setCharAt(j,temp1);
        //     i++;
        //     j--;
           sb.insert(1,'e');
           sb.delete(2, 4);       
        System.out.println(sb);
    }
}

