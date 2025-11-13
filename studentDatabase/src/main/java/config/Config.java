package config;

import connections.*;

public class Config {
	public static String getURL() {
		return "jdbc:mysql://localhost:3306/jdbc";
	}
	public static String getUserName() {
		return "root";
	}
	public static String getPassword() {
		return "81920";
	}
}
