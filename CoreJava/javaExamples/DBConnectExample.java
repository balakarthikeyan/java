package javaExamples;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
	 
public class DBConnectExample {
    public static void main(String[] args) {
        String databaseURL = "jdbc:mysql://localhost:3306/angular";
        // String databaseURL = "jdbc:mysql://localhost:3306/angular?user=root&password=";
        String user = "root";
        String password = "";
        Connection conn = null;      
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Properties props = new Properties();
            props.put("user", user);
            props.put("password", password);        	
            // conn = DriverManager.getConnection(databaseURL, props);
            conn = DriverManager.getConnection(databaseURL, user, password);
            if (conn != null) {
                System.out.println("Connected to the database");
            }
        } /*catch (ClassNotFoundException ex) {
            System.out.println("Could not find database driver class");
            ex.printStackTrace();
        } */catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}