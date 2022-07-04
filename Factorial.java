import java.util.Scanner;
class fact{
fact() {
Scanner uu = new Scanner(System.in);
int num, sum=1;
	System.out.print("Enter the number to find Factorial : ");
	num=uu.nextInt();
	if(num>0){
	
	for(int i=1;i<=num;i++) {
		sum=sum*i;

	}
	System.out.println("Factorial is : " + sum);
	}
	else if(num==0) {
	System.out.println("Factorial is : " + "1");
	}
	else {
		System.out.println("-----Enter the value >= 0------");
	}
	
}
}
  class Factorial{
 public static void main(String args[]) {
 fact vv = new fact();
 }
 }
 