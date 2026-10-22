import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(81);
        a.add(54);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(23);
        b.add(8541);
        b.add(5420);
        b.add(20);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(30);
        c.add(1);
        c.add(64);
        c.add(5);
        c.add(525);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        arr.add(a);
        arr.add(b);
        arr.add(c);

        // System.out.println(arr);
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){ // we are using get(i) bec each row has diff size
                System.out.print(arr.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }
}