import java.util.Scanner;
class Dev { 
int ID;
String name;
int age;
int salary;
String Designation;


	Scanner uu = new Scanner(System.in);
	Dev() {
		System.out.print("Enter ID : ");
		ID = uu.nextInt();
		System.out.print("Enter Name : ");
		name = uu.next();
		System.out.print("Enter age : ");
		age = uu.nextInt();
		System.out.print("Enter salary : ");
		salary = uu.nextInt();
		System.out.print("Enter Designation : ");
		Designation = uu.next();

		
}
		void print() {
		System.out.println("ID  : " + ID);
		System.out.println("Name : " + name);
		System.out.println("age  : " + age);
		System.out.println("salary  : " + salary);
		System.out.println("Designation  : " + Designation);
}

}

class Demo4 {
	public static void main (String args[]){
		Dev ucu = new Dev();
		ucu.print();
}
}