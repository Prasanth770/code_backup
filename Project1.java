import java.util.Scanner;
class Employee 
 {
	Scanner uu = new Scanner(System.in);
	int id, age, salary;
	int yy;
	String designation, name;
	Employee() {}
	
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
		id = u3.nextInt();
		System.out.print("Enter Name : ");
		name = u3.next();
		System.out.print("Age : ");
		age = u3.nextInt();
		System.out.println("***********************************");
		
	}	
	
	
	void raiseSalary() {
		System.out.println("1.Clerk");
		System.out.println("2.Developer");
		System.out.println("3.Manager");
		System.out.println("4.Tester");
		Scanner yc = new Scanner(System.in);
		yy=yc.nextInt();
	if(yy==1){
	salary = salary + 5000;
	}
	else if(yy==2){
	salary = salary + 1000;
	}
	else if(yy==3){
	salary = salary + 20000;
	}
	else if(yy==4){
	salary = salary + 30000;
	}
	else {
	System.out.println("--------------Exit-------------------");
	}
	
	}
	
}

class Clerk extends Employee {
		void fn() {
		salary =25000;
		designation="Clerk ";	
		}
		/*Clerk(int id, String name, int age) {
			this.id = id;
			this.name = name;
			this.age= age;
	}*/
}
class Developer extends Employee {
		Developer() {
		salary =95000;
		designation="Developer ";	
		}
}
class Manager extends Employee {
		Manager() {
		salary =75000;
		designation="Manager";	
		}
}
class Tester extends Employee {
		Tester() {
		salary =65000;
		designation="Tester";	
		}
}
		
class Project1 {
	public static void main(String args[]) {
		int ch1=0,ch2=0;
		 Employee em = new Employee();
		// cdcccCollection<Clerk> clea = new ArrayList<Clerk>();
	
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
		Clerk cl = new Clerk();
		Developer de = new Developer();
		Manager ma = new Manager();
		Tester te = new Tester();
		
			if(ch1==1) 
			{
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
								case 1: cl.create();
										// clea.add(new Clerk(id, ename, salary));
										break;
								
								case 2: de.create();
										break;
								
								case 3: ma.create();
										break;
										
								case 4: te.create();
										break;
								
					}
				}while(ch2<4);
				
			}
			if(ch1==2)
			{
					cl.display();
					de.display();
					ma.display();
					te.display();	
			}
			
			if(ch1==3)
			{
					em.raiseSalary();
			}
	}while(ch1!=4); 
	
			System.out.println("Total no Employees created : ");
	}
}