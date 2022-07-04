import java.util.*;
class A
{
    public void abc() throws InvalidAgeException { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        if(age<18) 
            throw new InvalidAgeException("Invalid Age");
        else
            System.out.println("Valid Age");
    }

}
public class Demo {
    public static void main(String[] args) throws InvalidAgeException {
        try {
            A a = new A();
            a.abc();
        }
        catch(InvalidAgeException iva) {
            System.out.println("Age must be more than 18");
        }
    }
    
}
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
