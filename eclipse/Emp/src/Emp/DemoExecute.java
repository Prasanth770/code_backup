package Emp;

import java.sql.*;


public class DemoExecute {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prasanth","root","$Prasanth123");
			Statement stmt = con.createStatement();
			ResultSet rs= stmt.executeQuery("Select * from emp");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getInt(3)+ " : "+rs.getInt(4)+" : "+rs.getString(5));
			}
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
