import java.util.*;
interface I 
{
	
}

class Emp
{
	String name;
	int age;
	double salary;
	String designation;
	static int count=0;
	Emp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter name :");
		name=sc.nextLine();
		System.out.print("\n Enter Age :");
		age=sc.nextInt();
		
		
	}
	public void display()
	{
		System.out.println("\nNAME:"+name+ "\nAGE:"+age+ "\nSALARY:"+salary+"\nDESIGNAION:"+designation);	
	}
	public  void raiseSalary(){

    }
	
	
}

final class Clerk extends Emp {
	public Clerk(){
		salary=10000;
		designation="Clerk";
	}
	public void raiseSalary(){
		salary=(1.05*salary);
		
	}
}

final class Developer extends Emp{
	public Developer(){
		salary=20000;
		designation="Developer";
	}
	public void raiseSalary(){
		salary=(1.15*salary);
		
	}
}
final class Manager extends Emp{
	public Manager(){
		salary=70000;
		designation="Manager";
	}
	public void raiseSalary(){
		salary=(1.2*salary);
		
	}
}
final class Tester extends Emp{
	public Tester(){
		salary=20000;
		designation="Tester";
	}
	public void raiseSalary(){
		salary=(1.1*salary);
		
	}
}

public class Project5 {
	public static void main(String args[])
	{
		int ch1=0,ch2=0;
	    Clerk c;
        c= null;
		//int arr[] =new int[100];

		Emp e=new Emp[100];
		//ArrayList<Emp> list=new ArrayList<Emp>();
		//LinkedList<Emp> list=new LinkedList<Emp>();
		//HashSet<Emp> list=new HashSet<Emp>();
		do{
		System.out.println("--------------------------------");
		System.out.println("1.Create");
		System.out.println("2.Display");
		System.out.println("3.RiseSalary");
		System.out.println("4.Exit");
		System.out.println("--------------------------------");
		System.out.println("Enter your Choice: ");
		Scanner sc1=new Scanner(System.in);
		ch1=sc1.nextInt();

			if(ch1==1){
			do{
				System.out.println("--------------------------------");
				System.out.println("1.Clerk");
				System.out.println("2.Developer");
				System.out.println("3.Manager");
                System.out.println("4.Tester");
				System.out.println("4.Exit");
				System.out.println("--------------------------------");
				System.out.println("Enter your Choice: ");
				Scanner sc2=new Scanner(System.in);
				ch2=sc2.nextInt();
				switch(ch2){
					case 1:
						  e=new Emp();
						//list.add( new Clerk() );
						  break;
						
					case 2:
						//list.add(new Programmer());
						   e[Emp.count++]=new Developer();
						   break;
					
					case 3:
						//list.add(new Manager());
						    e[Emp.count++]=new Manager();
						    break;
                    case 4:
						//list.add(new Manager());
						    e[Emp.count++]=new Tester();
						    break;
					}
			}while(ch2!=5);
		}
		if(ch1==2)
		{ 
            for(Emp x:e) {
                if(x==null){
                    System.out.println("No Employee Found");
                }
                else {
                    System.out.println(x);
                }
               
            }

            /* 
			Iterator i=list.iterator();
			while(i.hasNext())
			{
				Emp x=(Emp) i.next();
				x.display();
			}*/
			
		}
		if(ch1==3)
		{ 
            for(Emp y:e){
                y.raiseSalary();
            }
            /* 
			Iterator i=list.iterator();
			while(i.hasNext())
			{
			System.out.println(i.next());
				Emp x=(Emp) i.next();
				x.riseSalary();
			}*/
		}
		}while(ch1!=4);
		System.out.println("Total no. of Employees Created:"+Emp.count);
	}
}
