import java.util.Scanner;
class Tester
{
	Scanner sc=new Scanner(System.in);
	int id;String name;int age;int salary ;
	String desig="Tester ";
	Tester ()
	{

		System.out.println("Your are entering Tester Data ");
		System.out.print("ENter Id : ");
		  id=sc.nextInt();

		System.out.print("ENter Name : ");
		 name= sc.next(); 

		System.out.print("ENter Age : ");
		 age =sc.nextInt();
		
		System.out.print("ENter Salary : ");
		salary =sc.nextInt();
		
		
	}
	void display()
	{
		System.out.println("***********************************");
		System.out.println(" ID : " + id );
		System.out.println("Name : " + name);
		System.out.println("Age : " + age );
		System.out.println("Salary : " + salary  );
		System.out.println("Designation : " + desig);
	}
}
class Manager 
{
	Scanner sc=new Scanner(System.in);
	int id;String name;int age;int salary ;
	String desig=" Manager ";
	Manager()
	{

		System.out.println("Your are entering Manager Data ");
		System.out.print("ENter Id : ");
		  id=sc.nextInt();

		System.out.print("ENter Name : ");
		 name= sc.next(); 

		System.out.print("ENter Age : ");
		 age =sc.nextInt();
		
		System.out.print("ENter Salary : ");
		salary =sc.nextInt();
		
		
	}
	void display()
	{
		System.out.println("***********************************");
		System.out.println(" ID : " + id );
		System.out.println("Name : " + name);
		System.out.println("Age : " + age );
		System.out.println("Salary : " + salary  );
		System.out.println("Designation : " + desig);
	}
}
class Dev
{
	Scanner sc=new Scanner(System.in);
	int id;String name;int age;int salary ;
	String desig="Developer ";
	Dev ()
	{

		System.out.println("Your are entering Developer Data ");
		System.out.print("ENter Id : ");
		  id=sc.nextInt();

		System.out.print("ENter Name : ");
		 name= sc.next(); 

		System.out.print("ENter Age : ");
		 age =sc.nextInt();
		
		System.out.print("ENter Salary : ");
		salary =sc.nextInt();
		
		
	}
	void display()
	{
		System.out.println("***********************************");
		System.out.println(" ID : " + id );
		System.out.println("Name : " + name);
		System.out.println("Age : " + age );
		System.out.println("Salary : " + salary  );
		System.out.println("Designation : " + desig);
	}
}
class Clerk
{
	Scanner sc=new Scanner(System.in);
	int id;String name;int age;int salary ;
	String desig="Clerk ";
	Clerk()
	{
		System.out.println("Your are entering Clerk Data ");

		System.out.print("ENter Id : ");
		  id=sc.nextInt();

		System.out.print("ENter Name : ");
		 name= sc.next(); 

		System.out.print("ENter Age : ");
		 age =sc.nextInt();
		
		System.out.print("ENter Salary : ");
		salary =sc.nextInt();
		
	}
	void display()
	{
		System.out.println("***********************************");
		System.out.println(" ID : " + id );
		System.out.println("Name : " + name);
		System.out.println("Age : " + age );
		System.out.println("Salary : " + salary  );
		System.out.println("Designation : " + desig);
		System.out.println("***********************************");
	}
}
class Project
{
	public static void main(String args[])
	{
		Dev d=new Dev();
		d.display();

		Manager m =new Manager();
		m.display();
	
		Clerk c=new Clerk();
		c.display();
		
		Tester t =new Tester();
		t.display();
	}
}