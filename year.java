import java.util.Scanner;
class Leap {

Leap() {
    Scanner sc = new Scanner(System.in);
	System.out.print ("Enter an Year");
	int year = sc.nextInt();
	
	 // if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		 
	 if((year%4==0) && (year%100!=0) && (year%400==0))
	 {
	 System.out.println(year + "is a leap year");
	 }
	else
	{
	System.out.println(year + "is not a leap year");
	}
	
	
	}
	
	}
class year {
 public static void main(String args[]) {
 Leap cc = new Leap();
 }
}