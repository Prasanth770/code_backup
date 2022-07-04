/*
---------------------------------ABSTRACTION----------------------

*/
/*
class  A
{
	A()
	{
	   System.out.println("A");
	}
	 void abc() 
	 {
		System.out.println("A method some Logic");
	 }

}
abstract class B
{
	B()
	{
	   System.out.println("B");
	}
	abstract void abc();
	void xyz() 
	 {
		System.out.println("A method some Logic");
	 }

}
class Demo21 {
	public static void main(String args[]) {
		 A a = new A();
		 // B b = new B();
		 a.abc();
		 // b.abc();
	}
}
*/

/* ---------
						class					   abstract class
	OBJ CREATION		A a = new A();			    nO
						only have non abstract      can have both
						method
						
						
---------if method is abstract then class must be abstract 

------------*/

//-------------------------
/*-----------------
abstract class A
{
	abstract void abc();
}

abstract class B extends A 
{
	void abc(){
			System.out.println("Hi Overriding methof from B");
	}
	abstract void atoz();
	
}
class C extends B{
	void atoz(){
			System.out.println("Hi Overriding methof from c");
	}
}
class Demo21 {
	public static void main(String args[]) {
		 C c = new C();
		 c.abc();
		 c.atoz();
		 
	}
}
----------*/
/*---------------
abstract class RBI
{
	abstract void loan();
	abstract void account();
	abstract void OT();
	abstract void ATM();
	void Remitance(){}
	
}
class SBI extends RBI 
{
	void loan(){System.out.println("From SBI");}
	void account(){System.out.println("From SBI");}
	void OT(){System.out.println("From SBI");}
	void ATM(){System.out.println("From SBI");}
	
}
class Axis extends RBI 
{
	void loan(){System.out.println("From Axis");}
	void account(){System.out.println("From Axis");}
	void OT(){System.out.println("From Axis");}
	void ATM(){System.out.println("From Axis");}
	
}
class Demo21 {
	public static void main(String args[]) {
		
		Axis a = new Axis();
		a.loan();
		 
	}
}
---------*/
/*-------
---------abstract class vs class vs interface

parameter          class             abstract class              interface
obj creaton		    yes					no    						no
constructor         yes					yes							no
variable     ---
initiliaztion----}   def 0             def 0                  need to assign, no def
method				only normal        both abstract method        only abstract method
										& normal method         
Security			0%        			0-100%						100%

multiple inheritance  no                no                            yes   			



*/
// -----------------------------------------------------------------
/*---------
class A 
{
	A()
	{
		
	}
	int a;
}
abstract class B 
{
	B() {}
	int b;
}
interface I 
{
	// I(){}
	// int i ;
	int ix = 120;
}
interface J 
{
	
}
interface K  extends J,I
{
	
}
class Demo21 {
	public static void main(String args[]) {
		
		A a = new A();
		
		 
	}
}
----------*/

interface I 
{
	int x =100;
	void add();
	void sub();
}
interface J 
{
	int y = 100;
	void mul();
	void div();
}
interface K extends I,J 
{
	
}
class Cal implements K 
{
	public void sub() {System.out.println(I.x-J.y);}
	public void add() {System.out.println(I.x+J.y);}
	public void mul() {System.out.println(I.x*J.y);}
	public void div() {System.out.println(I.x/J.y);}
}
class Demo21 {
	public static void main(String args[]) {
		Cal c = new Cal();
		System.out.println("----------------I------------------");
		I i = c;
		i.add();
		i.sub();
		System.out.println("----------------J------------------");
		J j = c;
		j.mul();
		j.div();
		System.out.println("----------------K------------------");
		K k = c;
		k.mul();
		k.div();
		k.add();
		k.sub();
	}
}