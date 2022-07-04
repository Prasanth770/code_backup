/*class Bank
 {
     public void eduloan()
     {
           System.out.println("7 % ");
     }
     
}
class Sbi extends Bank
{
    public void eduloan()
     {
           System.out.println(" 8  % ");
     }
}
class Axis extends Bank
{
    public void eduloan()
     {
           System.out.println(" 9  % ");
     }
}
public class Demo19 {

 

    public static void main(String[] args) {
        
            Sbi s=new Sbi();
            s.eduloan();
    }

 

}
*/
/*
----------------------------------------------------------------------------------------------
static no need to create object
accessed using class_name.method_name

*/
class A {
	static void main() {
		System.out.println("main method with static");
	}
}
class B{
	void abc() {
		System.out.println("Hi method...");
	}
}
class Demo19{
	public static void main(String args[]){
		B b = new B();
		b.abc();
		A.main();
	}
}