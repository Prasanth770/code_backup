package Emp;
import java.sql.*;

public class Employee {

	public static void main(String[] args) {
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","$Prasanth123");
			Statement stmt = con.createStatement();
			stmt.execute("insert into emp values(74001, 'Prasanth', 21, 39000, 'Developer', '2022-06-28', 'Chittoor', 9678985664, 1234567812345678, 'ASDF4563A'),\r\n"
					+ "(74002, 'Rakesh', 22, 35000, 'Manager', '2022-05-28', 'Mittoor', 9999985764, 9855665263215678, 'ABCD1234B'),\r\n"
					+ "(74003, 'Suresh', 23, 26000, 'Tester', '2022-05-28', 'Chittoor', 7702085764, 856321234521456, 'DEFG5678A'),\r\n"
					+ "(74004, 'Ramesh', 21, 37000, 'Programmer', '2022-07-28', 'Delhi', 0857272764, 9520142365478963, 'ZXCB9874A'),\r\n"
					+ "(74005, 'Manohar', 22, 37000, 'Developer', '2022-07-28', 'Banglore', 0857272765, 8520199995478963, 'AXCB9874A'),\r\n"
					+ "(74006, 'surya', 23, 37000, 'Developer', '2022-07-28', 'Hyderabad', 0857272766, 7520142888878963, 'ZXCB9632A'),\r\n"
					+ "(74007, 'Priya', 22, 37000, 'Developer', '2022-07-28', 'Chittoor', 0857272767, 6520142355558963, 'SXCB9874A'),\r\n"
					+ "(74008, 'Bindhu', 21, 37000, 'Developer', '2022-07-28', 'Chennai', 0857272768, 2520142365478963, 'DXCB9874A'),\r\n"
					+ "(74009, 'prudhvi', 23, 37000, 'Developer', '2022-07-28', 'Chennai', 0857272769, 352014564778963, 'ABCB9874A'),\r\n"
					+ "(74010, 'Nagarjuna', 26, 37000, 'Developer', '2022-07-28', 'Banglore', 0857272564, 959632365478993, 'DDDB9874A'),\r\n"
					+ "(74011, 'Ravi', 25, 37000, 'Developer', '2022-07-28', 'Chittoor', 0857272664, 9520178945478973, 'EEEB9874A'),\r\n"
					+ "(74012, 'Sunil', 23, 37000, 'Developer', '2022-07-28', 'Delhi', 0857252764, 9563245665469325, 'ZLLB9874A'),\r\n"
					+ "(74013, 'Sravan', 22, 37000, 'Developer', '2022-07-28', 'Hyderabad', 0857279964, 9523254693214563, 'ZMMB9874A'),\r\n"
					+ "(74014, 'Ganesh', 23, 37000, 'Developer', '2022-07-28', 'Chittoor', 0857882764, 1236548952136458, 'ZNNN9874A'),\r\n"
					+ "(74015, 'Kiran', 25, 37000, 'Developer', '2022-07-28', 'Chennai', 0857662764, 9615423852132546, 'ZXCB6578A');");
			stmt.close();
			System.out.println("Data saved Successfully....!");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}


/*
 insert into emp values(74001, 'Prasanth', 21, 39000, 'Developer', '2022-06-28', 'Chittoor', 9678985664, 1234567812345678, 'ASDF4563A'),
(74002, 'Rakesh', 22, 35000, 'Manager', '2022-05-28', 'Mittoor', 9999985764, 9855665263215678, 'ABCD1234B'),
(74003, 'Suresh', 23, 26000, 'Tester', '2022-05-28', 'Chittoor', 7702085764, 856321456321456, 'DEFG5678A'),
(74004, 'Ramesh', 24, 37000, 'Developer', '2022-07-28', 'Chittoor', 0857272764, 9520142365478963, 'ZXCB9874A'); */
