import java.util.Scanner;

class Employee{
    String name;
    int age,id;
    private String designation;
    private int salary;
    Scanner sz = new Scanner(System.in);

    void display() {
        System.out.println("***********************************");
		System.out.println(" ID : " + id );
		System.out.println("Name : " + name);
		System.out.println("Age : " + age );
		System.out.println("Salary : " + salary  );
        System.out.println("Designation : " + designation);
		System.out.println("***********************************");
    }

    void create() {
        System.out.println("***********************************");
		try (Scanner uu = new Scanner(System.in)) {
            System.out.print("Enter Id : ");
            id = uu.nextInt();
            System.out.print("Enter Name : ");
            name = sz.next();
            System.out.print("Age : ");
            age = uu.nextInt();
        }
		System.out.println("***********************************");

    }
}
class Clerk extends Employee {
    int salary = 25000;
    String designation = "Clerk";
    void raiseClerk() {
        salary = salary+5000;

    }

}
class Developer extends Employee {
    int salary = 0;
    String designation = "Developer";

}
class Tester extends Employee {
    int salary = 0;
    String designation = "Tester";

}
class Manager extends Employee {
    int salary = 0;
    String designation = "Manager";

}


public class Proj {
    public static void main(String[] args) {
        int sw1=0,sw2=0;
        //Employee emp = new Employee();
        Clerk cle = new Clerk();
        Tester tes = new Tester();
        Developer dev = new Developer();
        Manager mag = new Manager();
        //Scanner si = new Scanner(System.in);
       // Scanner sc = new Scanner(System.in);

        do{
        System.out.println("------------------------");
        System.out.println("1.Create");
        System.out.println("2.Display");
        System.out.println("3.Raise Salary");
        System.out.println("4.Exit");
        System.out.println("------------------------");
        System.out.println("Enter your choice");
        try (Scanner vv = new Scanner(System.in)) {
            sw1=vv.nextInt();
                if(sw1==1)
                {
                    int count = 0;
                    do{
                        System.out.println("---------------------------------");
            			System.out.println("1.Clerk");
            			System.out.println("2.Developer");
            			System.out.println("3.Manager");
            			System.out.println("4.Tester");
            			System.out.println("5.Exit");
            			System.out.println("---------------------------------");
            			System.out.println("Enter your choice");
                        sw2=vv.nextInt();
                        switch(sw2)
                        {
                            case 1: cle.create();
                                    break;
                            case 2: dev.create();
                                    break;
                            case 3: mag.create();
                                    break;
                            case 4: tes.create();
                                    break;
                            default: System.out.println("Enter your the correct choice ");
                                    break;
                            case 5: break;

                        }
                        if(count==1 || count==2 || count==3 || count==4){
                            count=count+1;
                        }
                        System.out.println("Total no of Employees Created : " +count);

                    }while(sw2!=5);

                }
        }
        if(sw1==2) {
                cle.display();
                dev.display();
                tes.display();
                mag.display();
            }
            if(sw1==3){
                cle.raiseClerk();

            }
            if(sw1==4){

            }


        }while(sw1!=6);
    }
    
}
