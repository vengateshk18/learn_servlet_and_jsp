package com.project;


import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpSession;

@WebServlet("/starting")
public class Starting extends  HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
        HttpSession session=request.getSession();
        int data1= (int) session.getAttribute("data1");
        int data2= (int) session.getAttribute("data2");
        ServletContext con=getServletContext();
        String name=con.getInitParameter("name");
        int result=data2+data1;
        response.setContentType("text/html");
        response.getWriter().println("Response :"+result+" Name: "+name);

    }
}
