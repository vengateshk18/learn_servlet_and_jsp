package com.project;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.project.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

import javax.sql.rowset.serial.SerialException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException{
        int data1=Integer.parseInt(request.getParameter("num1"));
        int data2=Integer.parseInt(request.getParameter("num2"));

        int result=data1+data2;

        response.setContentType("text/html");
        response.getWriter().println("Result: "+result);
    }

    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        int data1=Integer.parseInt(request.getParameter("num1"));
        int data2=Integer.parseInt(request.getParameter("num2"));
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        try(Connection conn=DBConnection.getConnection()){
            String sql="Insert into entry(num1,num2) values(?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, data1);
            stmt.setInt(2, data2);
            int rows = stmt.executeUpdate();

            if (rows > 0) {
                sql="Select * from entry";
                PreparedStatement data=conn.prepareStatement(sql);
                out.println(data.executeQuery());
            } else {
                out.println("<h3>Failed to Add Numbers!</h3>");
            }

        }
        catch ( Exception e){
            e.printStackTrace(out);
        }
    }
}
