package Hackerrank;

import java.sql.*;  

class tryConnect{  
public static void main(String args[]){  
try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection connection =DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/test","root","Welcome123");  
				
		Statement stmt = connection.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from employee");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		connection.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  