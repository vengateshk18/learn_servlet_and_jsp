package com.project;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        session.setAttribute("data1",10);
        session.setAttribute("data2",2);
        session.setAttribute("operation","multiply");
        Cookie cookie=new Cookie("data1","data1");
        response.addCookie(cookie);
        response.sendRedirect("starting");


    }
}


