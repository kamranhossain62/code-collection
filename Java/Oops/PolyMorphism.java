import java.util.*;
public class PolyMorphism {
    public static class Dog{
        void speak(){
            System.out.println(" Bhau Bhau");
        }
    }
        public static class Cat{
        void speak(){
            System.out.println(" Meow Meow");
        }
    }
        public static class Lion{
        void speak(){
            System.out.println("GRRRRRRRR ");
        }
    }
        public static class Pickachu{
        void speak(){
            System.out.println("Pika Pika");
        }
    }
        public static class Human{
            void speak(){
                System.out.println("Hello");
            }
        }
        public static void main(String args[]){
            Dog d=new Dog();
            Cat c=new Cat();
            Human h=new Human();
            Pickachu p=new Pickachu();
            d.speak();
            c.speak();
            p.speak();
            h.speak();
        }
    }
    

