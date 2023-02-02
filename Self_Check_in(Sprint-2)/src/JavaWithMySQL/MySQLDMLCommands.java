package JavaWithMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDMLCommands {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
		
		//1.Creating the table
		Statement stat = con.createStatement();
		
		String s = "INSERT INTO student VALUES(2, 'Anand', 24)";
		
		//2.Updating the table
		//String s = "UPDATE STUDENT SET NAME='VINAY' WHERE ID=2";
		
		//3.Deleting the data
		//String s = "DELETE FROM STUDENT WHERE NAME='VINAY'";
		
		//Retrieving data
		String s1 = "select id, name from student";
		ResultSet rs = stat.executeQuery(s);
		while (rs.next()) {
			int id = rs.getInt("ID");
			String name = rs.getString("NAME");
			System.out.println(id + "         " + name + "     ");
		}
		
		//stat.execute(s);
		con.close();
		
		System.out.println("Query Executed.....");
		
	}

}