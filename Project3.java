import java.util.Scanner;
class Employee  {
	Scanner uu = new Scanner(System.in);
	Scanner u1 = new Scanner(System.in);
	int id, age, salary;
	int yy;
	String designation, name;
	void display()
	{
		System.out.println("***********************************");
		System.out.println(" ID : " + id );
		System.out.println("Name : " + name);
		System.out.println("Age : " + age );
		System.out.println("Salary : " + salary  );
		System.out.println("Designation : " + designation);
		System.out.println("***********************************");
	}
	void create()
	{
		System.out.println("***********************************");
		Scanner u3 = new Scanner(System.in);
		System.out.print("Enter Id : ");
		id = u1.nextInt();
		System.out.print("Enter Name : ");
		name = u3.next();
		System.out.print("Age : ");
		age = u1.nextInt();
		System.out.println("***********************************");
        u3.close();
	}		
	
class Clerk extends Employee {
	int salary =25000;
	String designation="Clerk ";	
	
	void raiseclerk() { 
		salary = salary + 5000;
	}
}
class Developer extends Employee {
	int salary =95000;
	String designation="Developer ";
	
	void raisedeveloper() { 
		salary = salary + 1000;
	}
}
class Manager extends Employee {
	int salary =75000;
	String designation="Manager";
	
	void raisemanager() { 
		salary = salary + 20000;
	}
}
class Tester extends Employee {
	int salary =65000;
	String designation="Tester";	
	
	void raisetester() { 
		salary = salary + 30000;
		}
	}
}
		
class Project3 {
	public static void main(String args[]) {
		int ch1=0,ch2=0;
		Employee em = new Employee();
		Clerk cle = new Clerk();
		Developer dev = new Developer();
		Manager mag = new Manager();
		Tester tes = new Tester();
		Scanner u3 = new Scanner(System.in);
		int count1=0;
	
	do{
		System.out.println("---------------------------------");
		System.out.println("1.Create Employee");
		System.out.println("2.Display");
		System.out.println("3.Raise Salary");
		System.out.println("4.Exit");
		System.out.println("---------------------------------");
		System.out.println("Enter your choice");
		Scanner vv = new Scanner(System.in);
		ch1=vv.nextInt();

			if(ch1==1) 
			{   int count = 0;
				do
				{
					
					System.out.println("---------------------------------");
					System.out.println("1.Clerk");
					System.out.println("2.Developer");
					System.out.println("3.Manager");
					System.out.println("4.Tester");
					System.out.println("5.Exit");
					System.out.println("---------------------------------");
					System.out.println("Enter your choice");
					Scanner v1 = new Scanner(System.in);
					ch2=v1.nextInt();
					switch(ch2) 
					{
								case 1: cle.create();
										break;
									
								case 2: dev.create();
										break;
								
								case 3: mag.create();
										break;
										
								case 4: tes.create();
										break;
										
								case 5 : break;
					}
					
				}while(ch2<4);
               count=count+1;
				System.out.println("Total no Employees created : "+ count); 
				
			}
			if(ch1==2)
			{
					cle.display();
					dev.display();
					mag.display();
					tes.display();	
			}
			
			if(ch1==3)
			{		Scanner bn = new Scanner(System.in);
					System.out.println("Enter the Desigination to raise ");
					System.out.println("1.Clerk");
					System.out.println("2.Developer");
					System.out.println("3.Manager");
					System.out.println("4.Tester");
					System.out.println("5.Exit");
					
					int ch5 = bn.nextInt();
					switch(ch5) 
					{
								case 1: cle.raiseclerk();
										break;
									
								case 2:// dev.raisedeveloper();
										break;
								
								case 3: // mag.raisemanager();
										break;
										
								case 4:// tes.raisetester();
										break;
										
								case 5 : break;
					}
			}
		}while(ch1!=4); 
	
			System.out.println("--------------Exit-----------");

	}
}
