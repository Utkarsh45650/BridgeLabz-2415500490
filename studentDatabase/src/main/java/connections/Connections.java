package connections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
	
	private static String URL;
	private static String UserName;
	private static String Password;
	private static Connection conn;
	
	

	public Connection Connections() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(URL,UserName,Password);
			System.out.println("Connection created");
			return conn;
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
		return null;
	}
	
	public void setURL(String URL) {
		this.URL=URL;
	}
	
	public void setUserName(String UserName) {
		this.UserName=UserName;
	}
	
	public void setPassword(String Password) {
		this.Password=Password;
	}
	
//	public String getURL() {
//		return URL;
//	}
//	
//	public String getUserName() {
//		return UserName;
//	}
//	
//	public String getPassword() {
//		return Password;
//	}
	
//	private void setConnection(String URL, String UserName, String Password){
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn=DriverManager.getConnection(URL,UserName,Password);
//			
//		}catch(Exception ex) {
//			System.out.println(ex.getMessage());
//			
//		}
//	}
	
//	public Connection getConn() {
//		return conn;
//	}
}
