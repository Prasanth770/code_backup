package Emp;

import java.sql.*;

import java.util.*;

public class DemoDelete {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prasanth","root","$Prasanth123");
			PreparedStatement stmt = con.prepareStatement("delete from emp  where id=?");
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter id :");
			int id =sc.nextInt();
			
			stmt.setInt(1, id);
			System.out.println("Do you really want to delete");
			String ch= sc.next();
			if(ch.equalsIgnoreCase("yes")) {
				stmt.execute();
				System.out.println("Data Deleted.........!");
			}
			else {
				System.out.println("Data Not Deleted");
			}
				
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
