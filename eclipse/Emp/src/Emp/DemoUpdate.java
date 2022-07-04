package Emp;


import java.sql.*;
import java.util.*;

public class DemoUpdate {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prasanth","root","$Prasanth123");
			PreparedStatement stmt = con.prepareStatement("update emp set salary = ? where id=?");
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter id :");
			int id =sc.nextInt();
			
			System.out.print("Enter Salary :");
			int salary =sc.nextInt();
			
			stmt.setInt(1, salary);
			stmt.setInt(2, id);
			
			stmt.execute();
			con.close();
			System.out.println("Data Updated.........!");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}


	}

}
