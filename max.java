import java.util.Scanner;
class abc{
Scanner uu = new Scanner(System.in);
	abc(){
	System.out.print("Enter value of a : ");
	int a =uu.nextInt();
	System.out.print("Enter value of b : ");
	int b =uu.nextInt();	
	System.out.print("Enter value of c : ");
	int c =uu.nextInt();
	
	if(a > b && a>c) {
	System.out.println("Max value is a ");
	}
	if(b > c && b>a) {
	System.out.println("Max value is b ");
	}
	if(c > b && c>a) {
	System.out.println("Max value is c ");
	}
	
  }

 }
  class max{
 public static void main(String args[]) {
 abc vv = new abc();
 }
 }
 