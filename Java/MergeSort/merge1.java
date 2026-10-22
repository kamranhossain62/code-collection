// package Java.merge;
import java.util.*;
public class merge1 {
    public static void main(String args[]){
        int arr[] ={5,3,699,5,48,65,4587,221,01};
        mergesort(arr);
        for(int ele:arr) System.out.println(ele+" ");
    }
    public static void mergesort(int arr[]){
        int n=arr.length;
        if(n==1) return ;
        // step 1 : create 2 empty array of size n/2 each
        int a[]=new int[n/2];
        int b[]=new int[n-n/2];
        //  step 2:copy-paste arr into a and b
        int idx=0; // idx travel karega arr pe
        for(int i=0;i<a.length;i++)
            a[i] =arr[idx++];
        for(int i=0;i<b.length;i++)
            b[i]=arr[idx++];
        //  step3 : magic
        mergesort(a);
        mergesort(b);
        // step 4: merge 'a' and 'b' into arr
        merge(a,b,arr);
}
         public static void merge(int a[] ,int b[],int c[]){
            int i=0,j=0,k=0;
            while(i<a.length && j<b.length){
                if(a[i]<=b[j]) c[k++]=a[i++];
                else c[k++] =b[j++];
            }
            while(i<a.length) c[k++]=a[i++];
            while(j<b.length) c[k++]=b[j++];
         }
    } 
