public class RecursiononArray {
    public static void main(String args[]){
        int arr[]={55,64,2,45,98,100};
        // recprint(arr,0);
        int target=98;
        System.out.println(exists(arr,target,0));
    }
    public static boolean exists(int arr[],int target,int index){
     if(index==arr.length) return false;
        if(arr[index] == target) return true;
        return exists(arr,target,index+1);
    }
    public static void recprint(int arr[],int index){
        int n=arr.length;
        if (index == n) return ;
        System.out.print(arr[index]+ " ");
        recprint(arr,index+1);
    }
}
