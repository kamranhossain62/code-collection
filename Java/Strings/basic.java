public class basic{ // (Built in methods)
    public static void main(String args[]){
        String s="Kamran Hossain";
        String s1=" Kingston";
        System.out.println(s.indexOf('a'));
         System.out.println(s.lastIndexOf('a'));
         System.out.println(s.toLowerCase());
         System.out.println(s.toUpperCase());
         System.out.println(s.contains("Kam"));
         if(s.contains("Hossain"))
            System.out.println("NJ");
        System.out.println(s.startsWith("Kamran"));
        System.out.println(s.compareTo(s1));
         System.out.println(s.concat ( s1));
         s=s+s1; // plus
         s+= 'n';
         s+= 01;
         System.out.println(s);
          System.out.println("kamran"+10+20);
          System.out.println(10+20+"kamran");
          System.out.println(10+"kamran"+20);
    }
}
