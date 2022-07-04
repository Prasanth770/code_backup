import java.util.Scanner;
class subject{
	Scanner sc = new Scanner(System.in);
subject(){
	
System.out.println("1.Telugu");
System.out.println("2.Hindi");
System.out.println("3.English");
System.out.println("4.maths");
System.out.println("5.science");
System.out.println("6.social");
System.out.println("Enter the choice");
int ch = sc.nextInt();
switch(ch)
{

case 1: 
		System.out.println("You choosen Telugu");
		break;
case 2: 
		System.out.println("You choosen Hindi");
		break;
case 3: 
		System.out.println("You choosen English");
		break;
case 4: 
		System.out.println("You choosen maths");
		break;		
case 5 : 
		System.out.println("You choosen science");
		break;		
default : 
		System.out.println("Default");
		break;
		
		
		
}

}
}

class Demo7 {
public static void main(String args[]) {
subject ssc = new subject();
}
}