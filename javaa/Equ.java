public class Equ {
    public static void main(String[] args) {
        String n1 = "Suresh";
        String n2 = "Ramesh";
        String n3 = "Suresh";
        String n4 =new String("Suresh"); 
        String n5 =new String("Suresh"); 
        String n6 =new String("suresh");
        n1.concat("Kumar"); // immutable - can't change the
        System.out.println(n1);
        StringBuffer s1 = new StringBuffer("Suresh"); // we can change- mutable
        s1.append(" Kumar");
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder("Suresh"); // we can change= mutable
        s2.append(" Kumar");
        System.out.println(s2);

        System.out.println(n1==n2);
        System.out.println(n2==n3);
        System.out.println(n1==n3);
        System.out.println(n1.equals(n3));
        System.out.println(n4==n5);
        System.out.println(n4.equals(n5));
        System.out.println(n1==n3);

    }
    
}
