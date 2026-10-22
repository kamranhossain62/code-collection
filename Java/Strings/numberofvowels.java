import java.util.*;
public class numberofvowels {
    public static void main(String args[]){
        int count=0;
        String str="hgbzlzfgpapgaiubtndiwgjgaignaoihngfpabnabpab";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
              count++;
            }
             System.out.print(count);
        }
    }
    
