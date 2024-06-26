/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package userLogin;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.*;

/**
 *
 * @author Vijaya Malla
 */
public class userSignUp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Connection conn = null;
        String username = request.getParameter("user");
        String password = request.getParameter("pass");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Establishing connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_servlet", "root", "");

            // create an object of parameter class which is responsible for execution queries
            Statement stmt = conn.createStatement();

            // inserting data into database table
            String query = "insert into `tbl_user` values('" + username + "', '" + password + "')";
            int a = stmt.executeUpdate(query);
            if (a > 0) {
                out.println("Data inserted successfully.");
            } else {
                out.println("Something went wrong....");
            }
            conn.close();
        } catch (Exception e) {
            out.println("Error " + e);
        }
    }
}
