package com.project;
import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
}
