
// this & super keyword
/*

class A{
	int a = 10;
}
class B extends A{
	int a = 100;
	B(int a) {
		System.out.println("A : "+a);
		System.out.println("A : "+this.a);
		System.out.println("A : "+super.a);
	}
}

class Demo14 {
public static void main(String args[]) {
		B b = new B(1000);
}
}
*/

class A
{
    A()
    {
        this(100);
        System.out.println(" A ()");
    }
    A(int  a )
    {
        System.out.println(" A (int a )");
    }    
}

 

class Demo14
{    
    public static void main(String args[])
    {
    
        A a= new A();    
    }

 

}