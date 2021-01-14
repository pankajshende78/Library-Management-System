package a2;

import java.sql.*;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdb","root","root");
		
	}catch(Exception e){System.out.println(e);}
	return con;
}
}
