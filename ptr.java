import java.util.Scanner;
class ptrr{
ptrr(){
	int Interest;
Scanner uu = new Scanner(System.in);
	System.out.print("Enter the Req Details to calculate SI");
	System.out.print("Enter the Principle amount : ");
	int p=uu.nextInt();
	System.out.print("Enter the no of years : ");
	int t =uu.nextInt();
	System.out.print("Enter rate of interest : ");
	int r=uu.nextInt();
	
	Interest = (p*t*r)/100 ;
		System.out.print("Interest : " + Interest);
	
	
}
}
  class ptr{
 public static void main(String args[]) {
 ptrr vv = new ptrr();
 }
 }