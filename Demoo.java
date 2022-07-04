import java.util.Scanner;

class Tester 
{
	static Scanner sc=new Scanner(System.in);
	static int id;
	static String name;
	static int age;
	static int salary ;
	static String desig;
	static void create()
	{
		System.out.print("Enter Id : ");
		  id=sc.nextInt();

		System.out.print("Enter Name : ");
		 name= sc.next(); 

		System.out.print("Enter Age : ");
		 age =sc.nextInt();
		salary =25000;
		desig="Tester ";	
	}
	static void display()
	{
		if(name==null)
			System.out.println("You have not entered the details of Tester");
		else
		{
			System.out.println("---------------------------------");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
			System.out.println("---------------------------------");
		}
	}
	static void raiseSalary()
	{
		salary =25000;

		salary=salary+1000;
		System.out.println("Raised salary of Tester"+salary);

	}
}
class Manager  
{
	
	static Scanner sc=new Scanner(System.in);
	static int id;
	static String name;
	static int age;
	static int salary ;
	static String desig;
	static void create()
	{
		System.out.print("Enter Id : ");
		  id=sc.nextInt();

		System.out.print("Enter Name : ");
		 name= sc.next(); 

		System.out.print("Enter Age : ");
		 age =sc.nextInt();
		salary =90000;
		desig="Manager ";	
	}
	static void display()
	{
		if(name==null)
			System.out.println("You have not entered the details of employee Manager");
		else
		{
			System.out.println("---------------------------------");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
			System.out.println("---------------------------------");
		}	
		
	}
	static void raiseSalary()
	{
		salary = 90000;
		salary=salary+30000;
		System.out.println("Raised salary of Manager"+salary);
	}
}
class Dev 
{
	
	static Scanner sc=new Scanner(System.in);
	static int id;
	static String name;
	static int age;
	static int salary ;
	static String desig;
	static void create()
	{
		System.out.print("Enter Id : ");
		  id=sc.nextInt();

		System.out.print("Enter Name : ");
		 name= sc.next(); 

		System.out.print("Enter Age : ");
		 age =sc.nextInt();
		salary =500000;
		desig="Dev ";	
	}
	static void display()
	{
		if(name==null)
			System.out.println("You have not entered details of employee Developer");
		else 
		{
			System.out.println("---------------------------------");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
			System.out.println("---------------------------------");
		}
	}
	static void raiseSalary()
	{
		salary = 50000;
		salary=salary+20000;
		System.out.println("Raised salary of Dev"+salary);
	}
}
class Clerk 
{
	static Scanner sc=new Scanner(System.in);
	static int id;
	static String name;
	static int age;
	static int salary ;
	static String desig;
	static void create()
	{
		System.out.print("Enter Id : ");
		  id=sc.nextInt();

		System.out.print("Enter Name : ");
		 name= sc.next(); 

		System.out.print("Enter Age : ");
		 age =sc.nextInt();
		salary =2000;
		desig="Clerk ";	
	}
	static void display()
	{
		if(name==null)
			System.out.println("You have not entered details of employee Clerk");
		else 
		{
			System.out.println("---------------------------------");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
			System.out.println("---------------------------------");
		}
	}
	static void raiseSalary()
	{
		salary = 2000;
		salary=salary+5000;
		System.out.println("Raised salary of Clerk"+salary);
	}
}
class Create1 
{
	void printer()
	{
		System.out.println("---------------------------------");
		System.out.println("1.Create ");		
		System.out.println("2.Display ");
		System.out.println("3.Raise salary ");
		System.out.println("4.Exit ");
		System.out.println("---------------------------------");
	}
}
class Demoo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Create1 c1=new Create1();
		System.out.println("---------------------------------");
		System.out.println("1.Create ");		
		System.out.println("2.Display ");
		System.out.println("3.Raise salary ");
		System.out.println("4.Exit ");
		System.out.println("---------------------------------");
		int n,n1;
		while(true)
		{
			n=sc.nextInt();
			switch(n)
			{
				case 1: System.out.println("Enter type of employee you want to create ");
						System.out.println("---------------------------------");
						System.out.println("1.Developer");
						System.out.println("2.Manager");
						System.out.println("3.Clerk");
						System.out.println("4.Tester ");
						System.out.println("---------------------------------");
						n1=sc.nextInt();
						switch(n1)
						{
							case 1: //System.out.println("Enter the Details of  Developer");
									Dev.create();
									c1.printer();
									break;
							case 2: // System.out.println("Enter the Detailsof  Manager ");
									Manager.create();
									c1.printer();
									break;
							case 3: // System.out.println("Enter the Details of clerk");
									Clerk. create();
									c1.printer();
									break;
							case 4: // System.out.println("Enter the  Details of Tester");
									Tester.create();
									c1.printer();
									break;
							case 5: System.exit(0);
									break;
							default:
						}
						break;
				case 2: System.out.println("Display all the employees details ");
						Dev.display();
						Manager.display();
						Clerk.display();
						Tester.display();
						c1.printer();
						break;
				case 3: System.out.println("Raising the salary of all employees ");
						Dev.raiseSalary();
						Manager.raiseSalary();
						Clerk.raiseSalary();
						Tester.raiseSalary();
						c1.printer();
						break;
				
				
				
				
				
						/*
						Scanner bn = new Scanner(System.in);
						System.out.println("Enter the Desigination to raise ");
						System.out.println("1.Clerk");
						System.out.println("2.Developer");
						System.out.println("3.Manager");
						System.out.println("4.Tester");
						int rai = bn.nextInt();
					
						if(rai==1){
						 Clerk.raiseSalary();
						}
						else if(rai==2){
						Dev.raiseSalary();
						}
						else if(rai==3){
						Manager.raiseSalary();
						}
						else if(rai==4){
						Tester.raiseSalary();
						}
						else {
						System.out.println("You Entered not valid ");
							}
						c1.printer();*/
				
						
				case 4: System.out.println("Exit");
						break;
				default: System.out.println("Please Enter the correct option"); 
							break;
			}
			if(n==4)
				break;
		}
	}
}