public class TowerOfHanoi {
    public static void main(String args[]){
        hanoi(10,'A','B','C');
        // A=source
        // B=helper
        // C=Destination
    }
    public static void hanoi(int n,char A,char B,char C){
    if(n==0) return ;
    hanoi(n-1,A,C,B); // N-1 disks from a to b via c
    System.out.println(A +"->"+C); // Largest disk from A to C
    hanoi(n-1,B,A,C); // N-1 disk from B to C via A
    }
}
