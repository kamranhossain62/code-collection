// import java.util.*;

// public class PowerSet {
//     public static void main(String args[]){
//         String s="kamran";
//         subsets("",s,0);
//     }
//     public static void subsets(String ans,String s,int index){
//         if(index==s.length()){
//             System.out.print(ans+ " ");
//             return;
//         }
//         char ch=s.charAt(index);
//         subsets(ans+ch,s,index+1); //pick
//         subsets(ans,s,index+1); // skip
//     }
// }
    //  Using ArrayList
    import java.util.*;

public class PowerSet {
    public static void main(String args[]){
        String s="kamran";
        List<String> list=new ArrayList<>();
        subsets("",s,0,list);
        System.out.println(list);
    }
    public static void subsets(String ans,String s,int index,List<String> list){
        if(index==s.length()){
            if(ans.length()!=0)
            list.add(ans);
            return;
        }
        char ch=s.charAt(index);
        subsets(ans+ch,s,index+1,list); //pick
        subsets(ans,s,index+1,list); // skip
    }
}
