import java.util.Scanner;
class percen{
Scanner cc = new Scanner(System.in);
String name;
int total;

percen(){}

void calculate_percentage() {
 	System.out.print("Enter NAME");
	name=cc.next();
	System.out.print("Enter age");
	int age=cc.nextInt();
 	System.out.print("Enter the marks");
 	System.out.print("Enter marks in Telugu");
	int t=cc.next();
 	System.out.print("Enter marks in Hindi");
	int h=cc.next();
 	System.out.print("Enter marks in English");
	int e=cc.next();
 	System.out.print("Enter marks in Maths");
	int m=cc.next();
 	System.out.print("Enter marks in Physics");
	int p=cc.next();
 	System.out.print("Enter marks in Biology");
	int b=cc.next();
 	System.out.print("Enter marks in Chemistry");
	int c=cc.next();
 	System.out.print("Enter marks in Social Studies");
	int ss=cc.next();

	total = t+h+e+m+p+b+c+ss;
	per=total/8;

	if(per>=85){
 	System.out.print("Passed with Grade A");
								}
	else if(per>=75 && per<85){
 	System.out.print("Passed with Grade B");
								 }

	else if(per>=50 && per<75){
 	System.out.print("Passed with Grade C"); 
								}

	else if(per>=50 && per<60){
 	System.out.print("Passed with Grade D"); 
								}
	else {
 	System.out.print("Passed with Grade E");

								}
	
}
}

class Demo6 {
public static void main (String args[]){
percen vv = new percen();
vv.calculate_percentage();
}
}