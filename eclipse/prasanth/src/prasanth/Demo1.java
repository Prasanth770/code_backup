package prasanth;

import java.sql.*;

public class Demo1 {

	public static void main(String[] args) {
		
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prasanth","root","$Prasanth123");
			Statement stmt = con.createStatement();
			stmt.execute("insert into emp values(101, 'Ramesh', '35', 90000, 'Manager')");
			stmt.close();
			System.out.println("Data saved Successfully....!");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
