// import java.util.*;
// public class Revision {
//     public static class pokemon{
//         int hp;
//         int speed;
//         int attack;
//         int defense;
//         String type;
//         String name;
//     }
//     public static void main(String args[]){
//         pokemon p1=new pokemon();
//         p1.name="Pikachu";p1.type="Electric";p1.attack=80;
//         pokemon p2=new pokemon();
//         p2.name="charizard";p2.type="fire";p2.attack=110;
//         pokemon p3=p1;      
//         p3.type="Water";
//         System.out.println(p1.type);
//     }
    
// }
import java.util.*;
class pokemon{
    private int power;
    String type;
    pokemon(String type,int power){  // setter
        this.power=power;
        this.type=type;
    }
    int getpower(){ // i can't access power normally because it is private.
        return power; 
    }
    void print(){ // getter
        System.out.println(this.power+ " "+this.type);
    }
}
public class Revision{
    public static void main(String args[]){
        pokemon pikachu =new pokemon("Electric",85);
        pikachu.type="Fire";
        // pikachu.power=34;
        pokemon jigglepuff=new pokemon("Fairy",50);
        System.out.println(pikachu.getpower());
        pikachu.print(); jigglepuff.print(); 
    }
}
