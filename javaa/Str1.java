public class Str1 {
    public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Hello");
    // StringBuilder sb = new StringBuilder("Hello");
    sb.append("Ramesh");
    System.out.println(sb);

    sb.insert(0, "Hi");
    System.out.println(sb);

    sb.replace(7,15,"Rakesh");
    System.out.println(sb);

    sb.delete(1,5);
    System.out.println(sb);

    System.out.println(sb.reverse());

    }
    
}
