class A 
{
	int a = 100;
	int b = 200;
	final void m1() {
		System.out.println("Hi A class");
	}
}
class B extends A
{

	 final int b = 200;
	 /// void m1() {
	// System.out.println("Hi A class");
	//}
}
class Demo22 {
	public static void main(String args[]) {
		 B b1 = new B();
		 b1.m1();
		
		 System.out.println(b1.b);
		 // b1.b =10000;
		 //System.out.println(b1.b);
	}
}