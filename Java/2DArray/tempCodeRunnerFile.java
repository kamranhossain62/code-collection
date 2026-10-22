public class Arraylist{
    public static void main(String args[]){
          Arraylist<Integer> a=new Arraylist<>();
        a.add(5); a.add(81); a.add(54); a.add(205);
          Arraylist<Integer> b=new Arraylist<>();
        b.add(23); b.add(8541); b.add(5420); b.add(20);
          Arraylist<Integer> c=new Arraylist<>();
        c.add(30); c.add(1); c.add(64); c.add(05);
        Arraylist<Arraylist<Integer>> arr=new Arraylist<>();
        arr.add(a); arr.add(b); arr.add(c);
        System.out.println(arr);
    }
}