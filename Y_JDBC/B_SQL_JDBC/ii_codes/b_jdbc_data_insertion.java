package Y_JDBC.B_SQL_JDBC.ii_codes;

import java.sql.*;

// public class App {  // use this in real scenario
public class b_jdbc_data_insertion {
    public static void main(String[] args) throws Exception {
        String username = "ram";
        String password = "ram@123";
        String fullname = "Ram Thapa";
        String email = "ram@gmail.com";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Establishing connetion
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jdbc", "root", "");

            Statement stmt = con.createStatement();

            // inserting data into database table
            String query = "insert into users values('" + username + "', '" + password + "','" + fullname + "','" + email + "')";
            int a = stmt.executeUpdate(query);
            if (a > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Something went wrong....");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
