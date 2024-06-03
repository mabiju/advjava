package Y_JDBC.B_SQL_JDBC.ii_codes;


import java.sql.*;

// public class App {  // use this in real scenario
public class d_jdbc_data_retrieve_all {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Establishing connetion
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jdbc", "root", "");

            Statement stmt = con.createStatement();

            // selecting all data to show
            String query = "select * from users";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("User name : " + rs.getString(1));
                System.out.println("Password : " + rs.getString(2));
                System.out.println("Fullname: " + rs.getString(3));
                System.out.println("Email: " + rs.getString(4));
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
