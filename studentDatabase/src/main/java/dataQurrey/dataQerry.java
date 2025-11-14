package dataQurrey;

import java.sql.*;

import connections.Connections;
import java.util.Scanner;
import config.Config;

public class dataQerry implements IDataQuerry{
	
	Connections conn=new Connections();

	Config config = new Config();
	
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void CreateTable() throws SQLException {
			
		String querry=" CREATE TABLE IF NOT EXISTS studentsdata (\r\n"
			       + " id INT AUTO_INCREMENT PRIMARY KEY,\r\n"
			       + " name VARCHAR(100) NOT NULL,\r\n"
			       + " age INT,\r\n"
			       + " email VARCHAR(100),\r\n"
			       + " enrolled_date DATE\r\n"
			       + " );";
			
		conn.setURL(Config.getURL());
		conn.setUserName(Config.getUserName());
		conn.setPassword(Config.getPassword());
			
		Connection con=conn.Connections();
			
		Statement stmt=con.createStatement();
			
		stmt.executeUpdate(querry);
			
		System.out.println("Table Created.\n\n");
		
		
		con.close();
		}
	
	@Override
	public void DisplayData() throws SQLException{
		String querry="SELECt * from studentsdata;";
		conn.setURL(Config.getURL());
		conn.setUserName(Config.getUserName());
		conn.setPassword(Config.getPassword());
		
		Connection con=conn.Connections();
		
		Statement stmt=con.createStatement();
		ResultSet result= stmt.executeQuery(querry);
		while(result.next()) {
			 System.out.println("ID:-" + result.getInt("id") 
			 					+ "\nName:-" + result.getString("name")
			 					+ "\nAge:-" + result.getInt("age") 
			 					+ "\nEmail:-" + result.getString("email") 
			 					+ "\nEnrolled Date:-" + result.getDate("enrolled_date") + "\n\n");
		 }
		
		con.close();
	}

	@Override
	public void InsertSingleData() throws SQLException{
		conn.setURL(Config.getURL());
		conn.setUserName(Config.getUserName());
		conn.setPassword(Config.getPassword());
			
		Connection con=conn.Connections();
		
		System.out.print("Please enter the Name of Student :- ");
		String name=sc.nextLine();
		System.out.print("Please enter Age of Student :- ");
		int age=sc.nextInt();
		System.out.println("Please enter E-Mail of the student :- ");
		sc.nextLine();
		String email=sc.nextLine();
		System.out.print("Please enter Date of  enrollment (YYYY-MM-DD) :- ");
		String date=sc.nextLine();
		
		String querry = "INSERT INTO studentsdata (name, age, email, enrolled_date) VALUES (?, ?, ?, ?)";
		PreparedStatement prestmt = con.prepareStatement(querry);
		
		prestmt.setString(1, name);
		prestmt.setInt(2, age);
		prestmt.setString(3, email);
		prestmt.setDate(4, Date.valueOf(date));
		
		prestmt.executeUpdate();
		System.out.println("Student added successfully.\n\n");
		
		con.close();
	}
	
	@Override
	public void InsertMultipleData() throws SQLException{
		String querry="INSERT INTO studentsdata (name, age, email, enrolled_date) VALUES (?, ?, ?, ?)";
		conn.setURL(Config.getURL());
		conn.setUserName(Config.getUserName());
		conn.setPassword(Config.getPassword());
		
		Connection con=conn.Connections();
		
		PreparedStatement prestmt = con.prepareStatement(querry);
		
		System.out.print("Enter the number of students you want to enter at a time :-");
		int x=sc.nextInt();
		
		for(int i=0;i<x;i++) {
			System.out.print("Please enter the Name of Student :- ");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("Please enter Age of Student :- ");
			int age=sc.nextInt();
			System.out.print("Please enter E-Mail of the student :- ");
			sc.nextLine();
			String email=sc.nextLine();
			System.out.print("Please enter Date of  enrollment (YYYY-MM-DD) :- ");
			String date=sc.nextLine();
			
			prestmt.setString(1, name);
			prestmt.setInt(2, age);
			prestmt.setString(3, email);
			prestmt.setDate(4, Date.valueOf(date));
			
			prestmt.addBatch();
		}
		
		prestmt.executeBatch();
		System.out.println("Multiple Students added successfully.\n\n");
		
		con.close();
	}
	
	@Override
	public void DeleteSingleData() throws SQLException {
		String querry="DELETE from studentsdata WHERE id = ?;";
		
		conn.setURL(Config.getURL());
		conn.setUserName(Config.getUserName());
		conn.setPassword(Config.getPassword());
			
		Connection con=conn.Connections();
			
		PreparedStatement prestmt = con.prepareStatement(querry);
		
		System.out.print("Enter the ID of student you want to Delete :- ");
		int id=sc.nextInt();
		prestmt.setInt(1, id);
		
		prestmt.executeUpdate();
		System.out.println("Student deleted Successfully.\n\n");
		
		con.close();
	}
	
	@Override
	public void DeleteMultipleData() throws SQLException{
		String querry="DELETE from studentsdata WHERE id = ?;";
		conn.setURL(Config.getURL());
		conn.setUserName(Config.getUserName());
		conn.setPassword(Config.getPassword());
		
		Connection con=conn.Connections();
		PreparedStatement prestmt=con.prepareStatement(querry);
		
		System.out.print("Enter the number of students you want to Delete :-");
		int x=sc.nextInt();
		
		for(int i=0;i<x;i++) {
			System.out.print("Enter the ID of student you want to Delete :- ");
			int id=sc.nextInt();
			
			prestmt.setInt(1, id);
			
			prestmt.addBatch();
		}
		prestmt.executeBatch();
		System.out.println("Multiple students deleted successfully.\n\n");
		
		con.close();
	}
	
	@Override
	public void UpdateSingleData() throws SQLException {
		
		System.out.print("Enter the ID of student you want to Update :- ");
		int id=sc.nextInt();
		
		System.out.print("select :-\n1 to change name.\n2 to change age.\n3 to change email.");
		int x=sc.nextInt();
		
		conn.setURL(Config.getURL());
		conn.setUserName(Config.getUserName());
		conn.setPassword(Config.getPassword());
		
		String y=null;
		int age = 0;
		String querry = null;
			
		Connection con=conn.Connections();
		
		querry="UPDATE studentsdata SET ? = ? WHERE id = ?;";
		PreparedStatement prestmt = con.prepareStatement(querry);
		
		if(x==1) {
//			querry="UPDATE students SET name = ? WHERE id = ?;";
			System.out.println("Enter new name :- ");
			y=sc.nextLine();
			
//			PreparedStatement prestmt = con.prepareStatement(querry);
			
			prestmt.setString(1, "name");
			prestmt.setString(2, y);
			prestmt.setInt(3,id);
			
//			prestmt.addBatch();
			
			System.out.println("Student name edited successfully.\n\n");
		}
		else if(x==2) {
//			querry="UPDATE students SET age = ? WHERE id = ?;";
			System.out.println("Enter new age :- ");
			age=sc.nextInt();
			
//			PreparedStatement prestmt = con.prepareStatement(querry);
			
			prestmt.setString(1, "age");
			prestmt.setInt(2, age);
			prestmt.setInt(3, id);
			
//			prestmt.addBatch();
			
			System.out.println("Student age edited successfully.\n\n");
		}
		else if(x==3) {
//			querry="UPDATE students SET email = ? WHERE id = ?;";
			System.out.println("Enter new E-Mail :- ");
			y=sc.nextLine();
			
//			PreparedStatement prestmt = con.prepareStatement(querry);
			
			prestmt.setString(1, "email");
			prestmt.setString(2, y);
			prestmt.setInt(3,id);
			
//			prestmt.addBatch();
			
			System.out.println("Student E-Mail edited successfully.\n\n");
		}
		else {
			System.out.println("Invalid Input.");
		}
		
		prestmt.executeUpdate();
	}
	
	@Override
	public void UpdateMultipleData() throws SQLException {
		conn.setURL(Config.getURL());
		conn.setUserName(Config.getUserName());
		conn.setPassword(Config.getPassword());
		
		Connection con=conn.Connections();
		
		System.out.println("Enter number of students you want to edit :- ");
		int val=sc.nextInt();
		
		
		String querry = "UPDATE students SET ? = ? WHERE id = ?;";
		
		PreparedStatement prestmt = con.prepareStatement(querry);
		
		for(int i=0;i<val;i++) {
			System.out.println("Enter the ID of student you want to Update :- ");
			int id=sc.nextInt();
			
			System.out.println("select :-\n1 to change name.\n2 to change age.\n3 to change email.");
			int x=sc.nextInt();
			
			String y;
			int age =0;
			
			if(x==1) {
//				querry="UPDATE students SET name = ? WHERE id = ?;";
				System.out.println("Enter new name :- ");
				y=sc.nextLine();
				
//				PreparedStatement prestmt = con.prepareStatement(querry);
				
				prestmt.setString(1, "name");
				prestmt.setString(2, y);
				prestmt.setInt(3,id);
				
//				prestmt.addBatch();
				
				System.out.println("Student name edited successfully.\n\n");
			}
			else if(x==2) {
//				querry="UPDATE students SET age = ? WHERE id = ?;";
				System.out.println("Enter new age :- ");
				age=sc.nextInt();
				
//				PreparedStatement prestmt = con.prepareStatement(querry);
				
				prestmt.setString(1, "age");
				prestmt.setInt(2, age);
				prestmt.setInt(3, id);
				
//				prestmt.addBatch();
				
				System.out.println("Student age edited successfully.\n\n");
			}
			else if(x==3) {
//				querry="UPDATE students SET email = ? WHERE id = ?;";
				System.out.println("Enter new E-Mail :- ");
				y=sc.nextLine();
				
//				PreparedStatement prestmt = con.prepareStatement(querry);
				
				prestmt.setString(1, "email");
				prestmt.setString(2, y);
				prestmt.setInt(3,id);
				
//				prestmt.addBatch();
				
				System.out.println("Student E-Mail edited successfully.\n\n");
			}
			else {
				System.out.println("Invalid Input.");
			}
			prestmt.addBatch();
		}
		prestmt.executeBatch();
		
		System.out.println("All students edited/updated successfully.\n\n");
	}
	
}
