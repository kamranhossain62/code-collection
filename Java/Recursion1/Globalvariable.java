
// package JavaRecursion1;
import java.util.*;
public class Globalvariable {

    static int n = 10;

    public static void main(String[] args) {

        n = 8;
        System.out.println(n);      // 8

        int n = 88;
        System.out.println(n);      // 88

        n = 0;
    }

    public static void fun() {

        n = 30;                     // changes static variable
        int x = 55;                 // local variable
        System.out.println(n);      // 30
        System.out.println(x);      // 55
    }
}

