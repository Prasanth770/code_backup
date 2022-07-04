public class Str {
    public static void main(String[] args) {
    String name ="Ramesh";
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(name.endsWith("h"));
    System.out.println(name.startsWith("R"));
    System.out.println(name.isEmpty());
    System.out.println(name.isBlank());
    System.out.println(name.length());
    System.out.println(name.replace('m','k'));
    System.out.println(name.trim().length());
    System.out.println(name.reverse());

    String job = "im a java Developer working in Hexaware";
    String[] words = job.split("\\s");
    for(String w:words){
        System.out.println(w);
    }
    System.out.println(job.substring(5));
    System.out.println(job.substring(7));
    }
    
}
