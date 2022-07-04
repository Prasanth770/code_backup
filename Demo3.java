import java.util.Scanner;
class Read { 

	Scanner uu = new Scanner(System.in);
	Read() {
		System.out.print("Enter ID : ");
		int ID = uu.nextInt();
		System.out.print("Enter Name : ");
		String name = uu.next();
		System.out.print("Enter age : ");
		int age = uu.nextInt();
		System.out.print("Enter salary : ");
		int salary = uu.nextInt();
		System.out.print("Enter Designation : ");
		String Designation = uu.next();
		System.out.println("ID  : " + ID);
		System.out.println("Name : " + name);
		System.out.println("age  : " + age);
		System.out.println("salary  : " + salary);
		System.out.println("Designation  : " + Designation);
		
}

}

class Demo3 {
	public static void main (String args[]){
		Read ucu = new Read();
}
}