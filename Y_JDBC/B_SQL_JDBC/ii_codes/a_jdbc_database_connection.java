package Y_JDBC.B_SQL_JDBC.ii_codes;

import java.sql.*;

// public class App {   // use this in real scenario
public class a_jdbc_database_connection {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Establishing connetion
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jdbc", "root", "");
            if (con != null) {
                System.out.println("Connection established successfully.");
            } else {
                System.out.println("Something went wrong....");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
