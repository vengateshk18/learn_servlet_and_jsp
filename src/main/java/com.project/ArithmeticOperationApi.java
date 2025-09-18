package com.project;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/arithmetic-api")
public class ArithmeticOperationApi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int data1=Integer.parseInt(request.getParameter("num1"));
        int data2=Integer.parseInt(request.getParameter("num2"));
        String operationMethod=request.getParameter("operation");
        int result=0;
        if(operationMethod.equals("add")){
            RequestDispatcher obj=request.getRequestDispatcher("add");
            obj.forward(request,response);
        }
        else if(operationMethod.equals("subtract")){
            result=data1-data2;
        }
        else if(operationMethod.equals("multiply")){
            result=data1*data2;
        }
        else if(operationMethod.equals("divide")){
            if(data2!=0){
                result=data1/data2;
            }
            else{
                result=-1;
            }
        }
        else{
            result=-1;
        }
        response.setContentType("application/json");
        String message = "{ \"operation\": \"" + operationMethod + "\", \"result\": " + result + " }";
        response.getWriter().write(message);
    }
}
