package com.dcl;
import java.io.*;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Demo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String mail = req.getParameter("mail");
        String password = req.getParameter("password");
        String confirmPass = req.getParameter("confirmPass");

        // Password check
        if (!password.equals(confirmPass)) {
            out.println("Passwords do not match ❌");
            return;
        }

        String query = "INSERT INTO STUDENT (NAME, PHONE, MAIL, PASSWORD) VALUES (?, ?, ?, ?)";

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            try (Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1", "system", "root123");
                 PreparedStatement ps = con.prepareStatement(query)) {

                ps.setString(1, name);
                ps.setString(2, phone); // safer as string
                ps.setString(3, mail);
                ps.setString(4, password);

                int i = ps.executeUpdate();

                if (i > 0) {
                    out.println("Registration successful ✅");
                } else {
                    out.println("Registration failed ❌");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("Something went wrong ❌");
        }
    }
}