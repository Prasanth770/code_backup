import java.util.Scanner;
class abc{
Scanner uu = new Scanner(System.in);
int average;
int per;
int total;
	abc(){
	System.out.print("To Find Percentage of Marks ");
	System.out.println("enter the Marks of Each subject as mentioned ");
	System.out.print("Telugu : ");
	int t =uu.nextInt();
	System.out.print("Hindi : ");
	int h =uu.nextInt();	
	System.out.print("English : ");
	int e =uu.nextInt();
	System.out.print("Maths : ");
	int m =uu.nextInt();
	System.out.print("Science : ");
	int s =uu.nextInt();
	System.out.print("Social : ");
	int ss =uu.nextInt();
	total = (t+h+e+m+s+ss);
	average=(t+h+e+m+s+ss)/6;
	per = total/6;
	System.out.println("Total Marks Secured :  " + total);	
	System.out.print("Percentage Secured :  "+ per+"%");	
	}

 }
 class percn{
 public static void main(String args[]) {
 abc vv = new abc();
 }
 }